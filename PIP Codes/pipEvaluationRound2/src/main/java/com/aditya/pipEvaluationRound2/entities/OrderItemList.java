package com.aditya.pipEvaluationRound2.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class OrderItemList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderItemListId;
    @ManyToOne
    private Menu menu;
    @ManyToOne
    private Orders orders;
    private int quantity;
}
