package com.aditya.pipEvaluationRound2.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemId;
    private String itemName;
    private float itemPrice;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "menu")
    private List<OrderItemList> orderItemLists = new ArrayList<>();
}
