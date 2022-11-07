package com.aditya.ConferenceRoomBookingRestApi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String userName;
    @OneToMany(mappedBy = "user")
    @Cascade(CascadeType.ALL)
    @JsonIgnore
    private List<RoomBookings> userRoomBookings;
}
