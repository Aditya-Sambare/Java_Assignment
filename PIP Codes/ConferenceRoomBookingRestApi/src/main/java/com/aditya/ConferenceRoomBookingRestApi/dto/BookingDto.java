package com.aditya.ConferenceRoomBookingRestApi.dto;

import lombok.Data;

import java.sql.Time;
@Data
public class BookingDto {
    private java.sql.Date bookingDate;
    private Time startingTime;
    private Time endingTime;
    private int userId;
    private int roomId;
}
