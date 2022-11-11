package com.aditya.CarStoreSystem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int orderId;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    CarsAtStore carsAtStore;
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    Customers customers;
    String orderStatus;
    String orderDeliveryDate;
    float orderDownPayment;
    float orderPrice;
    int carChesisNumber;
    Date orderDate;
}
