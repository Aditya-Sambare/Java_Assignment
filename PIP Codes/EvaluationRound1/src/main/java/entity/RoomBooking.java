package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class RoomBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int bookinId;
    Date bookingDate;
    Date startingTime;
    Date endingTime;
    @ManyToOne
    User user;
    @ManyToOne
    ConferenceRoom conferenceRoom;

    public RoomBooking() {
    }

    public int getBookinId() {
        return bookinId;
    }

    public void setBookinId(int bookinId) {
        this.bookinId = bookinId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(Date startingTime) {
        this.startingTime = startingTime;
    }

    public Date getEndingTime() {
        return endingTime;
    }

    public void setEndingTime(Date endingTime) {
        this.endingTime = endingTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ConferenceRoom getConferenceRoom() {
        return conferenceRoom;
    }

    public void setConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRoom = conferenceRoom;
    }

    @Override
    public String toString() {
        return "RoomBooking{" +
                "bookinId=" + bookinId +
                ", bookingDate=" + bookingDate +
                ", startingTime=" + startingTime +
                ", endingTime=" + endingTime +
                ", user=" + user +
                ", conferenceRoom=" + conferenceRoom +
                '}';
    }
}
