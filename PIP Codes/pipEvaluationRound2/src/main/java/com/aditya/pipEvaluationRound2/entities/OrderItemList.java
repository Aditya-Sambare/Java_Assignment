package com.aditya.pipEvaluationRound2.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class OrderItemList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderItemListId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Menu menu;
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Orders orders;
    private int quantity;
}
