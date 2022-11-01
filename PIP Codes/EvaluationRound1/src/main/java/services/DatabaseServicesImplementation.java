package services;
import entity.ConferenceRoom;
import entity.RoomBooking;
import entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.SessionFactoryProvider;
import javax.persistence.Query;
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
    public String addRoomBooking(RoomBooking roomBooking) {
        String result = null;
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("from RoomBooking");
        List<RoomBooking> list = query.getResultList();
        List<RoomBooking> list1 = list.stream().filter(s ->s.getBookingDate().equals(roomBooking.getBookingDate()) && s.getStartingTime().equals(roomBooking.getStartingTime()) && s.getEndingTime().equals(roomBooking.getEndingTime()))
        session.save(roomBooking);
        session.getTransaction().commit();
        session.close();
        return  result;
    }
}
