package entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.List;

@Entity
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int userId;
    String userName;
    @OneToMany(mappedBy = "user")
    @Cascade(CascadeType.PERSIST)
    List<RoomBooking> userRoomBookings;

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<RoomBooking> getUserRoomBookings() {
        return userRoomBookings;
    }

    public void setUserRoomBookings(List<RoomBooking> userRoomBookings) {
        this.userRoomBookings = userRoomBookings;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userRoomBookings=" + userRoomBookings +
                '}';
    }
}
