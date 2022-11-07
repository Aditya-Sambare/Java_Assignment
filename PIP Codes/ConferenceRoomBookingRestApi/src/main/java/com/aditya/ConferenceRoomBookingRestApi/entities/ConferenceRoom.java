package com.aditya.ConferenceRoomBookingRestApi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "roomName" }) })
public class ConferenceRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roomId;
    @Column(unique = true)
    private String roomName;
    @OneToMany(mappedBy = "conferenceRoom")
    @Cascade(org.hibernate.annotations.CascadeType.PERSIST)
    @JsonIgnore
    private List<RoomBookings> roomBookings;
}
