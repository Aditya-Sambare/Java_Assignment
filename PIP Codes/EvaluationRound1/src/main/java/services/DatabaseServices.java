package services;

import entity.ConferenceRoom;
import entity.RoomBooking;
import entity.User;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public interface DatabaseServices {
    public void addUser(User user);
    public String addRoom(ConferenceRoom room);
    public User getuser(int userId);
    public ConferenceRoom getroom(int roomId);
    public String addRoomBooking(RoomBooking roomBooking,int id);
    public String cancelRoomBooking(int bookingId);
    public List<RoomBooking> viewRoomBooking(Date d1 , Date d2);
    public String viewRoomAvailability(int roomId,Date date , Time startTime , Time endTime);
}
