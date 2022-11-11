package com.aditya.CarStoreSystem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class CarsAtStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int carId;
    String carModelName;
    float carPrice;
    String carCategory;
    int carAvailablity;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    Orders orders;
}
