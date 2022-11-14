package com.aditya.interview3Level.service;

import com.aditya.interview3Level.entities.Player;
import com.aditya.interview3Level.model.dto.requestDto.CreatePlayerDto;

public interface PlayerService {
    public Player createPlayer(CreatePlayerDto createPlayerDto);
}
