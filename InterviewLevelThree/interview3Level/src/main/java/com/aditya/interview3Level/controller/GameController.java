package com.aditya.interview3Level.controller;

import com.aditya.interview3Level.entities.Game;
import com.aditya.interview3Level.entities.Player;
import com.aditya.interview3Level.model.dto.requestDto.CreateGameDto;
import com.aditya.interview3Level.model.dto.requestDto.CreatePlayerDto;
import com.aditya.interview3Level.model.dto.requestDto.MovePlayerDto;
import com.aditya.interview3Level.model.dto.requestDto.PlayerAttackDto;
import com.aditya.interview3Level.service.GameService;
import com.aditya.interview3Level.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/game")
public class GameController {
    @Autowired
    GameService gameService;
    @PostMapping("/createGame")
    public ResponseEntity createGame(@RequestBody CreateGameDto createGameDto){
        try {
            Game game = gameService.createGame(createGameDto);
            if (game == null){
                return new ResponseEntity(Optional.of("Something Went Wrong"), HttpStatus.NOT_ACCEPTABLE);
            }else{
                return new ResponseEntity(Optional.of(game),HttpStatus.ACCEPTED);
            }
        }
        catch (Exception exception) {
            return new ResponseEntity(exception.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/movePlayer")
    public ResponseEntity movePlayer(@RequestBody MovePlayerDto movePlayerDto){
        try {
            String s = gameService.movePlayer(movePlayerDto);
            if(s.equals(null)){
                return new ResponseEntity(Optional.of("Something Went Wrong"),HttpStatus.NOT_ACCEPTABLE);
            }else{
                return new ResponseEntity(Optional.of(s),HttpStatus.ACCEPTED);
            }
        }
        catch (Exception exception) {
            return new ResponseEntity(exception.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/attackPlayer")
    public ResponseEntity attackPlayer(@RequestBody PlayerAttackDto playerAttackDto){
        try {
            String s = gameService.attackPlayer(playerAttackDto);
            if(s.equals(null)){
                return new ResponseEntity(Optional.of("Something Went Wrong"),HttpStatus.NOT_ACCEPTABLE);
            }else{
                return new ResponseEntity(Optional.of(s),HttpStatus.ACCEPTED);
            }
        }
        catch (Exception exception) {
            return new ResponseEntity(exception.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
