package com.aditya.ConferenceRoomBookingRestApi.controller;

import com.aditya.ConferenceRoomBookingRestApi.dto.BookingDto;
import com.aditya.ConferenceRoomBookingRestApi.dto.ViewBookingDto;
import com.aditya.ConferenceRoomBookingRestApi.entities.RoomBookings;
import com.aditya.ConferenceRoomBookingRestApi.entities.User;
import com.aditya.ConferenceRoomBookingRestApi.service.RoomBookingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/cancelbooking/{bookingId}")
    public ResponseEntity cancelBooking(@PathVariable int bookingId) {
        try {
            return roomBookingsService.cancelRoomBooking(bookingId);
        } catch (Exception exception) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/viewbooking")
    public ResponseEntity viewBooking(@RequestBody ViewBookingDto viewBookingDto) {
        try {
            return roomBookingsService.viewRoomBookings(viewBookingDto);
        } catch (Exception exception) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/viewavailableroom")
    public ResponseEntity availableRoom(@RequestBody BookingDto bookingDto) {
        try {
            return roomBookingsService.viewRoomAvailability(bookingDto);
        } catch (Exception exception) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
