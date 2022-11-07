package com.aditya.ConferenceRoomBookingRestApi.controller;

import com.aditya.ConferenceRoomBookingRestApi.dto.BookingDto;
import com.aditya.ConferenceRoomBookingRestApi.entities.RoomBookings;
import com.aditya.ConferenceRoomBookingRestApi.entities.User;
import com.aditya.ConferenceRoomBookingRestApi.service.RoomBookingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/roombookings")
public class RoomBookingsController {
    @Autowired
    RoomBookingsService roomBookingsService;
    @PostMapping("/add")
    public ResponseEntity user(@RequestBody BookingDto bookingDto) {
        try {
            return roomBookingsService.addRoomBooking(bookingDto);
        } catch (Exception exception) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
