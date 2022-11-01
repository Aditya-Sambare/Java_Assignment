package entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;


@Entity
public class RoomBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int bookinId;

    @Temporal(TemporalType.DATE)
    java.util.Date bookingDate;
    Time startingTime;
    Time endingTime;
    String bookingStatus;
    @ManyToOne
    User user;
    @ManyToOne
    ConferenceRoom conferenceRoom;

    public void setBookingDate(java.util.Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public RoomBooking() {
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public int getBookinId() {
        return bookinId;
    }

    public void setBookinId(int bookinId) {
        this.bookinId = bookinId;
    }

    public Date getBookingDate() {
        return (Date) bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Time getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(Time startingTime) {
        this.startingTime = startingTime;
    }

    public Time getEndingTime() {
        return endingTime;
    }

    public void setEndingTime(Time endingTime) {
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
