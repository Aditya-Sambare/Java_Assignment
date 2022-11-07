package com.aditya.ConferenceRoomBookingRestApi.controller;

import com.aditya.ConferenceRoomBookingRestApi.entities.ConferenceRoom;
import com.aditya.ConferenceRoomBookingRestApi.service.ConferenceRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/conferenceroom")
public class ConferenceRoomController {
    @Autowired
    ConferenceRoomService conferenceRoomService;
    @PostMapping("/add")
    public ResponseEntity conferenceRoom(@RequestBody ConferenceRoom conferenceRoom) {
        try {
            return conferenceRoomService.addConferenceRoom(conferenceRoom);
        } catch (Exception exception) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
