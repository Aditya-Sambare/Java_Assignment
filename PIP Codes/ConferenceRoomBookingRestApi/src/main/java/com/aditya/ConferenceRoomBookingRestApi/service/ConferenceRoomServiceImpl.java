package com.aditya.ConferenceRoomBookingRestApi.service;

import com.aditya.ConferenceRoomBookingRestApi.entities.ConferenceRoom;
import com.aditya.ConferenceRoomBookingRestApi.repository.ConferenceRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ConferenceRoomServiceImpl implements ConferenceRoomService {
    @Autowired
    ConferenceRoomRepository conferenceRoomRepository;
    @Override
    public ResponseEntity addConferenceRoom(ConferenceRoom conferenceRoom) {
        List<ConferenceRoom> conferenceRoomList = conferenceRoomRepository.findAll();
        List<ConferenceRoom> list1 = conferenceRoomList.stream().filter(s->s.getRoomName().equals(conferenceRoom.getRoomName().trim())).collect(Collectors.toList());
        if (list1.size()>0){
            return new ResponseEntity<>(Optional.of("Duplicate name not allowed"),HttpStatus.NOT_ACCEPTABLE);
        }else{
        ConferenceRoom conferenceRoom1 = conferenceRoomRepository.save(conferenceRoom);
        if (conferenceRoom1 == null){
            return new ResponseEntity(Optional.of("Conference room not inserted"), HttpStatus.NOT_ACCEPTABLE);
        }else{
            return new ResponseEntity(Optional.of(conferenceRoom1), HttpStatus.CREATED);

        }
    }
    }
}
