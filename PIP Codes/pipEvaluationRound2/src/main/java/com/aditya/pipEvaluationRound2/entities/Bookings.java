package com.aditya.pipEvaluationRound2.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingID;
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Tables tables;
    @OneToOne(cascade = CascadeType.ALL)
    private Orders orders;
    @OneToOne(cascade = CascadeType.ALL)
    private  Bill bill;
    @ManyToOne
    @JsonIgnore
    User user;
}
