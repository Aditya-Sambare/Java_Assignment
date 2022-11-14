package com.aditya.interview3Level.controller;

import com.aditya.interview3Level.entities.Player;
import com.aditya.interview3Level.model.dto.requestDto.CreatePlayerDto;
import com.aditya.interview3Level.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    PlayerService playerService;
    @PostMapping("/createPlayer")
    public ResponseEntity createPlayer(@RequestBody CreatePlayerDto createPlayerDto){
        try {
            Player player = playerService.createPlayer(createPlayerDto);
            if (player == null){
                return new ResponseEntity(Optional.of("Something Went Wrong"),HttpStatus.NOT_ACCEPTABLE);
            }else{
                return new ResponseEntity(Optional.of(player),HttpStatus.ACCEPTED);
            }
        }
        catch (Exception exception) {
            return new ResponseEntity(exception.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
