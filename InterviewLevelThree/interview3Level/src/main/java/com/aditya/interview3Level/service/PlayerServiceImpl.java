package com.aditya.interview3Level.service;

import com.aditya.interview3Level.entities.Player;
import com.aditya.interview3Level.entities.ScoresBoards;
import com.aditya.interview3Level.model.dto.requestDto.CreatePlayerDto;
import com.aditya.interview3Level.repository.PlayerRepository;
import com.aditya.interview3Level.repository.ScoresBoardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService{
    @Autowired
    PlayerRepository playerRepository;
    @Autowired
    ScoresBoardsRepository scoresBoardsRepository;
    @Override
    public Player createPlayer(CreatePlayerDto createPlayerDto) {
     Player player = new Player();
     player.setPlayerName(createPlayerDto.getPlayerName());
     player.setMobileNumber(createPlayerDto.getMobileNumber());
     player.setRewardPoints(0);
     Player player1 = playerRepository.save(player);
        ScoresBoards scoresBoards = new ScoresBoards();
        scoresBoards.setPlayer(player1);
        scoresBoards.setRanks(0);
        scoresBoards.setRewardsPoints(0);
        scoresBoardsRepository.save(scoresBoards);
     return player1;
    }
}
