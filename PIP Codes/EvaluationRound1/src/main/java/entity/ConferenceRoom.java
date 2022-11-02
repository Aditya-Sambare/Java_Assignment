package entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "roomName" }) })
public class ConferenceRoom {
    @Id
    int roomId;
    @Column(unique = true)
    String roomName;
    @OneToMany(mappedBy = "conferenceRoom")
    @Cascade(org.hibernate.annotations.CascadeType.PERSIST)
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
