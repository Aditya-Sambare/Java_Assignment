package com.aditya.pipEvaluationRound2.entities;

import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.*;

@Entity
@Data
public class Orders {
    @Id
    private int orderId;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "orders")
    private List<OrderItemList> itemlist = new ArrayList<>();
    @OneToOne(cascade = CascadeType.ALL)
    private Bookings bookings;

}
