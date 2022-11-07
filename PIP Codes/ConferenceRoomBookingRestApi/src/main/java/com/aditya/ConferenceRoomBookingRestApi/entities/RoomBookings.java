package com.aditya.ConferenceRoomBookingRestApi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;
@Entity
@Data
public class RoomBookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;

   // @Temporal(TemporalType.DATE)
    private java.sql.Date bookingDate;
    private Time startingTime;
    private Time endingTime;
    private String bookingStatus;

    @ManyToOne
    @JsonIgnore
    private User user;

    @ManyToOne
    @JsonIgnore
    private ConferenceRoom conferenceRoom;
}
