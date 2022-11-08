package com.aditya.pipEvaluationRound2.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingID;
    private String customerName;
    private long customerMobileNumber;
    @ManyToOne(cascade = CascadeType.ALL)
    private Tables tables;
    @OneToOne(cascade = CascadeType.ALL)
    private Orders orders;
    @OneToOne(cascade = CascadeType.ALL)
    private  Bill bill;
}
