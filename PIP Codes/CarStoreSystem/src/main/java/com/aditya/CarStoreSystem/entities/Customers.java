package com.aditya.CarStoreSystem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int customerId;
    String customerName;
    @OneToMany(mappedBy = "customers",cascade = CascadeType.ALL)
    @JsonIgnore
    List<Orders> ordersList;
}
