package com.aditya.pipEvaluationRound2.entities;

import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Data
public class Bill {
    @Id
    private int billId;
    private float billAmount;
    private String billStatus;
    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Tables table;
    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Orders order;
}
