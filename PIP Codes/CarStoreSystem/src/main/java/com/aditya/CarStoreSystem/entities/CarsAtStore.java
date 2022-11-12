package com.aditya.CarStoreSystem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

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
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "carsAtStore")
    @JsonIgnore
    List<Orders> orders;
}
