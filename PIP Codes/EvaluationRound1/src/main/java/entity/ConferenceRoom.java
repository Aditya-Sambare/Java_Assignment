package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class ConferenceRoom {
    @Id
    int roomId;
    String roomName;
    @OneToMany
    List<RoomBooking> roomBookings;

    public ConferenceRoom() {
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public List<RoomBooking> getRoomBookings() {
        return roomBookings;
    }

    public void setRoomBookings(List<RoomBooking> roomBookings) {
        this.roomBookings = roomBookings;
    }

    @Override
    public String toString() {
        return "ConferenceRoom{" +
                "roomId=" + roomId +
                ", roomName='" + roomName + '\'' +
                ", roomBookings=" + roomBookings +
                '}';
    }
}
