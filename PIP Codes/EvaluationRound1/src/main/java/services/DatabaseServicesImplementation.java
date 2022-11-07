package services;
import entity.ConferenceRoom;
import entity.RoomBooking;
import entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.SessionFactoryProvider;
import javax.persistence.Query;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
public class DatabaseServicesImplementation implements DatabaseServices{
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
    @Override
    public void addUser(User user) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public String addRoom(final ConferenceRoom room) {
        String result = null;        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("from ConferenceRoom");
        List<ConferenceRoom> list = query.getResultList();
        List<ConferenceRoom> list1 = list.stream().filter(s->s.getRoomName().equals(room.getRoomName())).collect(Collectors.toList());
        if (list1.size()>0){
            result = "Duplicate Room Name Not Allowed";
        }else {
            session.save(room);
            session.getTransaction().commit();
            result = "Room Added";
        }
        session.close();
        return result;
    }

    @Override
    public User getUser(int userId) {
        Session session = sessionFactory.openSession();
        User user = session.get(User.class,userId);
        session.close();
        return user;
    }

    @Override
    public ConferenceRoom getroom(int roomId) {
        Session session = sessionFactory.openSession();
        ConferenceRoom room = session.get(ConferenceRoom.class,roomId);
        session.close();
        return room;
    }

    @Override
    public String addRoomBooking(RoomBooking roomBooking,int id) {
        String result = null;
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("from RoomBooking where bookingDate =:dt and conferenceRoom.roomId=:id");
        query.setParameter("dt",roomBooking.getBookingDate());
        query.setParameter("id",id);
        List<RoomBooking> list=query.getResultList();
        boolean exists = false;
         if (list.size()==0){
             roomBooking.setBookingStatus("booked");
            session.save(roomBooking);
            session.getTransaction().commit();
            session.close();
            result = "Room Booked";
        }else{
        for(int i = 0; i < list.size(); i++){
                if((roomBooking.getStartingTime().after(list.get(i).getStartingTime()) &&
                        roomBooking.getStartingTime().before(list.get(i).getEndingTime()))
                        ||(roomBooking.getEndingTime().after(list.get(i).getStartingTime())
                        && roomBooking.getEndingTime().before(list.get(i).getEndingTime()))
                        ||(roomBooking.getStartingTime().before(list.get(i).getStartingTime())&&
                        roomBooking.getEndingTime().after(list.get(i).getEndingTime()))||
                        roomBooking.getStartingTime().equals(list.get(i).getStartingTime())||
                        roomBooking.getEndingTime().equals(list.get(i).getEndingTime()))
                {
                    if(list.get(i).getBookingStatus().equals("cancelled")){
                        exists = true;
                    }else {
                        exists = false;
                        break;
                    }
                }else{
                    exists = true;
                }
            }
        if (exists){
            roomBooking.setBookingStatus("booked");
            session.save(roomBooking);
            session.getTransaction().commit();
            session.close();
            result = "Room Booked";
        }else{
            result = "Room Not Available";
        }
     //   List<RoomBooking> list1 = list.stream().filter(s ->s.getBookingDate().equals(roomBooking.getBookingDate()) && s.getStartingTime().equals(roomBooking.getStartingTime()) && s.getEndingTime().equals(roomBooking.getEndingTime()));

    }
        return  result;
    }

    @Override
    public String cancelRoomBooking(int bookingId) {
        String result = null;
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        RoomBooking roomBooking = session.get(RoomBooking.class,bookingId);
        roomBooking.setBookingStatus("cancelled");
        session.save(roomBooking);
        result = "Booking Cancelled";
        session.getTransaction().commit();
        session.close();
        return result;
    }

    @Override
    public List<RoomBooking> viewRoomBooking(Date d1, Date d2) {
        List<RoomBooking> roomBookingList = new ArrayList<>();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("from RoomBooking");
        List<RoomBooking> roomBookingList1=query.getResultList();
        roomBookingList = roomBookingList1.stream().filter(s->s.getBookingDate().after(d1)&&s.getBookingDate().before(d2)).collect(Collectors.toList());
        return roomBookingList;
    }

    @Override
    public List<ConferenceRoom> viewRoomAvailability(Date date, Time startTime, Time endTime) {
        String result = null;
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query1 = session.createQuery("from ConferenceRoom");
        Query query = session.createQuery("from RoomBooking where bookingDate =:dt");
        query.setParameter("dt",date);
        List<Integer> roomIdList = new ArrayList<>();
        List<ConferenceRoom> conferenceRoomList = query1.getResultList();
        List<RoomBooking> roomBookingList = query.getResultList();
        if (roomBookingList.size()==0){
            return conferenceRoomList;
        }else {
            for(int i = 0; i < roomBookingList.size(); i++){
                if((startTime.after(roomBookingList.get(i).getStartingTime()) &&
                        startTime.before(roomBookingList.get(i).getEndingTime()))
                        ||(endTime.after(roomBookingList.get(i).getStartingTime()) &&
                        endTime.before(roomBookingList.get(i).getEndingTime()))
                        ||(startTime.before(roomBookingList.get(i).getStartingTime())&&
                        endTime.after(roomBookingList.get(i).getEndingTime()))||
                        startTime.equals(roomBookingList.get(i).getStartingTime())||
                        endTime.equals(roomBookingList.get(i).getEndingTime()))
                {
                    if (roomBookingList.get(i).getBookingStatus().equals("booked")) {
                        int id = roomBookingList.get(i).getConferenceRoom().getRoomId();
                        if(conferenceRoomList.stream().anyMatch(s->s.getRoomId()==id))
                        {
                            ConferenceRoom conferenceRoom=conferenceRoomList.stream().filter(s->s.getRoomId()==id).findFirst().get();
                            conferenceRoomList.remove(conferenceRoom);
                        }

                    }
                }
            }
        }
        return conferenceRoomList;
    }
}
