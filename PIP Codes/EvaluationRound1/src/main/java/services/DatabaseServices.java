package services;

import entity.ConferenceRoom;
import entity.RoomBooking;
import entity.User;

public interface DatabaseServices {
    public void addUser(User user);
    public String addRoom(ConferenceRoom room);
    public User getuser(int userId);
    public ConferenceRoom getroom(int roomId);
    public String addRoomBooking(RoomBooking roomBooking);
}
