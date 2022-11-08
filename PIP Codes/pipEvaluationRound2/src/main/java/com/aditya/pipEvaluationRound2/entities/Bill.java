package com.aditya.pipEvaluationRound2.entities;

import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Data
public class Bill {
    @Id
    private int billId;
    private float billAmount;
    private String billStatus;
    @OneToOne(cascade = CascadeType.ALL)
    private Bookings bookings;
}
