package com.aditya.pipEvaluationRound2.entities;

import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
@Data
public class Tables {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tableId;
    private String tableName;
    private int tableSeats;
    private String tableStatus;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "tables")
    private List<Bookings> bookingsList;
}
