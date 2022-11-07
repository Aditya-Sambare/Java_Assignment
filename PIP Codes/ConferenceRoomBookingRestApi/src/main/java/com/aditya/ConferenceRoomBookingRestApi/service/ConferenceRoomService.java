package com.aditya.ConferenceRoomBookingRestApi.service;

import com.aditya.ConferenceRoomBookingRestApi.entities.ConferenceRoom;
import com.aditya.ConferenceRoomBookingRestApi.entities.User;
import org.springframework.http.ResponseEntity;

public interface ConferenceRoomService {
    public ResponseEntity addConferenceRoom(ConferenceRoom conferenceRoom);
}
