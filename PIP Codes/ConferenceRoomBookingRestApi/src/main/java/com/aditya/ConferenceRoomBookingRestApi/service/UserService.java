package com.aditya.ConferenceRoomBookingRestApi.service;

import com.aditya.ConferenceRoomBookingRestApi.entities.User;
import org.springframework.http.ResponseEntity;

public interface UserService {
    public ResponseEntity addUser(User user);
}
