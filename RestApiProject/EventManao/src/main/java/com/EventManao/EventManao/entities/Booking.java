package com.EventManao.EventManao.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int bookinId;
    Date startDate;
    Date endDate;
    float totalPrice;
    int numberOfGuest;
    String status;


}
