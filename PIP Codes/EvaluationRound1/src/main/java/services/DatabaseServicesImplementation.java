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
            result = "Duplicate room name not allowed";
        }else {
            session.save(room);
            session.getTransaction().commit();
            result = "Room Added";
        }
        session.close();
        return result;
    }

    @Override
    public User getuser(int userId) {
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


         if (list.size()==0){
             roomBooking.setBookingStatus("booked");
            session.save(roomBooking);
            session.getTransaction().commit();
            session.close();
            result = "RoomBooked";
        }else{
        for(int i = 0; i < list.size(); i++){
            if ((list.get(i).getEndingTime().before(roomBooking.getStartingTime()) || list.get(i).getStartingTime().after(roomBooking.getEndingTime()))){
                roomBooking.setBookingStatus("booked");
                session.save(roomBooking);
                session.getTransaction().commit();
                session.close();
                result = "RoomBooked";
                break;
            }else{
                result = "Room not available";
            }
        }}
     //   List<RoomBooking> list1 = list.stream().filter(s ->s.getBookingDate().equals(roomBooking.getBookingDate()) && s.getStartingTime().equals(roomBooking.getStartingTime()) && s.getEndingTime().equals(roomBooking.getEndingTime()));
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
        result = "booking cancelled";
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
    public String viewRoomAvailability(int roomId, Date date, Time startTime, Time endTime) {
        String result = null;
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("from RoomBooking where bookingDate =:dt and conferenceRoom.roomId=:id");
        query.setParameter("dt",date);
        query.setParameter("id",roomId);
        List<RoomBooking> list=query.getResultList();
        if (list.size()==0){
            result = "Room Available";
        }else {
            for(int i = 0; i < list.size(); i++){
                if ((list.get(i).getEndingTime().before(startTime) || list.get(i).getStartingTime().after(endTime))){
                    result = "Room Available";
                }else{
                    result = "Room not available";
                }
            }
        }
        return result;
    }
}
