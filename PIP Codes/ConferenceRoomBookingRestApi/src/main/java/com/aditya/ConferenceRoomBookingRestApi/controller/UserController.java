package com.aditya.ConferenceRoomBookingRestApi.controller;

import com.aditya.ConferenceRoomBookingRestApi.entities.ConferenceRoom;
import com.aditya.ConferenceRoomBookingRestApi.entities.User;
import com.aditya.ConferenceRoomBookingRestApi.service.ConferenceRoomService;
import com.aditya.ConferenceRoomBookingRestApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/add")
    public ResponseEntity user(@RequestBody User user) {
        try {
            ResponseEntity user1 = userService.addUser(user);
            return new ResponseEntity<>(Optional.of(user1), HttpStatus.CREATED);
        } catch (Exception exception) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
