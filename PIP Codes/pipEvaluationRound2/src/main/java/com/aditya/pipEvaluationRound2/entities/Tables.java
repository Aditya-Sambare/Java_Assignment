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
    private Date tableBookingDate;
    private Time tableBookingTime;
    @OneToMany(mappedBy = "table")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Bill> bill;
    @OneToMany(mappedBy = "table")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Orders> order;
}
