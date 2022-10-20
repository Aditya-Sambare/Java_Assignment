package services;

import entity.ConferenceRoom;
import entity.RoomBooking;
import entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.SessionFactoryProvider;

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
    public void addRoom(ConferenceRoom room) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(room);
        session.getTransaction().commit();
        session.close();
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
    public void addRoomBooking(RoomBooking roomBooking) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(roomBooking);
        session.getTransaction().commit();
        session.close();
    }
}
