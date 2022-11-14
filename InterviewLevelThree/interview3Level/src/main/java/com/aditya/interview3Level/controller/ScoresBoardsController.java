package com.aditya.interview3Level.controller;

import com.aditya.interview3Level.entities.Player;
import com.aditya.interview3Level.entities.ScoresBoards;
import com.aditya.interview3Level.model.dto.requestDto.CreatePlayerDto;
import com.aditya.interview3Level.service.PlayerService;
import com.aditya.interview3Level.service.ScoresBoardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/leaderBoard")
public class ScoresBoardsController {
    @Autowired
    ScoresBoardsService scoresBoardsService;
    @GetMapping("/scores")
    public ResponseEntity getScores(){
        try {
          List<ScoresBoards> scoresBoardsList = scoresBoardsService.getScores();
          if (scoresBoardsList == null ){
              return  new ResponseEntity(Optional.of("something went wrong"),HttpStatus.NOT_ACCEPTABLE);
          }else{
              return new ResponseEntity(Optional.of(scoresBoardsList),HttpStatus.ACCEPTED);
          }
        }
        catch (Exception exception) {
            return new ResponseEntity(exception.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
