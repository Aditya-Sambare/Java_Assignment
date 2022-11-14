package com.aditya.interview3Level.service;

import com.aditya.interview3Level.entities.Game;
import com.aditya.interview3Level.model.dto.requestDto.CreateGameDto;
import com.aditya.interview3Level.model.dto.requestDto.MovePlayerDto;
import com.aditya.interview3Level.model.dto.requestDto.PlayerAttackDto;

public interface GameService {
    public Game createGame(CreateGameDto createGameDto);
    public String movePlayer(MovePlayerDto movePlayerDto);
    public String attackPlayer(PlayerAttackDto playerAttackDto);
}
