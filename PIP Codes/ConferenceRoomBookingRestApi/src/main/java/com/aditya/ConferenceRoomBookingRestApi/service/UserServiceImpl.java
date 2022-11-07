package com.aditya.ConferenceRoomBookingRestApi.service;

import com.aditya.ConferenceRoomBookingRestApi.entities.ConferenceRoom;
import com.aditya.ConferenceRoomBookingRestApi.entities.User;
import com.aditya.ConferenceRoomBookingRestApi.repository.ConferenceRoomRepository;
import com.aditya.ConferenceRoomBookingRestApi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public ResponseEntity addUser(User user) {
            User user1 = userRepository.save(user);
            if (user1 == null){
                return new ResponseEntity(Optional.of("User not inserted"), HttpStatus.NOT_ACCEPTABLE);
            }else{
                return new ResponseEntity(Optional.of(user1), HttpStatus.CREATED);

            }
    }
}
