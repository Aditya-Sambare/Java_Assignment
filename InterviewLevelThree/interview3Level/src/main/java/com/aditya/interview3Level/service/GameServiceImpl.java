package com.aditya.interview3Level.service;

import com.aditya.interview3Level.entities.Game;
import com.aditya.interview3Level.entities.Player;
import com.aditya.interview3Level.entities.ScoresBoards;
import com.aditya.interview3Level.exception.InvalidMoveException;
import com.aditya.interview3Level.exception.PositionOccupiedException;
import com.aditya.interview3Level.model.dto.requestDto.CreateGameDto;
import com.aditya.interview3Level.model.dto.requestDto.MovePlayerDto;
import com.aditya.interview3Level.model.dto.requestDto.PlayerAttackDto;
import com.aditya.interview3Level.repository.GameRepository;
import com.aditya.interview3Level.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameServiceImpl implements GameService{
    @Autowired
    GameRepository gameRepository;
    @Autowired
    PlayerRepository playerRepository;
    @Override
    public Game createGame(CreateGameDto createGameDto) {
        Game game = new Game();
        Player player1 = playerRepository.findById(createGameDto.getPlayer1Id()).get();
        Player player2 = playerRepository.findById(createGameDto.getPlayer2Id()).get();
        game.setPlayer1health(100);
        game.setPlayer1X(0);
        game.setPlayer1Y(0);
        game.setPlayer2health(100);
        game.setPlayer2X(0);
        game.setPlayer2Y(0);
        List<Player> playerList = new ArrayList<>();
        playerList.add(player1);
        playerList.add(player2);
        game.setPlayerList(playerList);
        Game game1 = gameRepository.save(game);
        return game1;
    }

    @Override
    public String movePlayer(MovePlayerDto movePlayerDto) {
        String result = "Player Was Not Able to Move";
        Game game = gameRepository.findById(movePlayerDto.getGameId()).get();
        if (game.getWinnerId()>0){
            return "Game is already over";
        }
        if (movePlayerDto.getX()<-10 || movePlayerDto.getX()>10 || movePlayerDto.getY()<-10 || movePlayerDto.getY()>10){
            throw  new InvalidMoveException();
        }if(movePlayerDto.getPlayer() == 1){
            if (game.getPlayer2X()== movePlayerDto.getX() && game.getPlayer2Y()== movePlayerDto.getY()){
                throw new PositionOccupiedException();
            }else{
                int x = game.getPlayer1X();
                int y = game.getPlayer1Y();
                if(x != movePlayerDto.getX() && y != movePlayerDto.getY()){
                    throw new InvalidMoveException();
                }
                if ( movePlayerDto.getX() > x+1 || movePlayerDto.getX() < x-1 || movePlayerDto.getY() > y+1 || movePlayerDto.getY() < y-1){
                    throw new InvalidMoveException();
                }
                game.setPlayer1X(movePlayerDto.getX());
                game.setPlayer1Y(movePlayerDto.getY());
                result =  "player has been moved";
            }
        }
        if (movePlayerDto.getPlayer() == 2){
            if (game.getPlayer1X() == movePlayerDto.getX() && game.getPlayer1Y()== movePlayerDto.getY()){
                throw new PositionOccupiedException();
            }else{
                int x = game.getPlayer2X();
                int y = game.getPlayer2Y();
                if(x != movePlayerDto.getX() && y != movePlayerDto.getY()){
                    throw new InvalidMoveException();
                }
                if ( movePlayerDto.getX() > x+1 || movePlayerDto.getX() < x-1 || movePlayerDto.getY() > y+1 || movePlayerDto.getY() < y-1){
                    throw new InvalidMoveException();
                }
                game.setPlayer2X(movePlayerDto.getX());
                game.setPlayer2Y(movePlayerDto.getY());
                result =  "player has been moved";
            }
        }
        gameRepository.save(game);
        return result;
    }

    @Override
    public String attackPlayer(PlayerAttackDto playerAttackDto) {
        String result = null;
        Game game = gameRepository.findById(playerAttackDto.getGameId()).get();
        if (game.getWinnerId()>0){
            return "Game is already over";
        }
        if (playerAttackDto.getPlayer() == 1){
            if (game.getPlayer2X() == playerAttackDto.getX() && game.getPlayer2Y() == playerAttackDto.getY()){
                game.setPlayer2health(game.getPlayer2health()-20);
                result = "good attack";
            }else{
                result = "attack missed";
            }
        }
        if (playerAttackDto.getPlayer() == 2){
            if (game.getPlayer1X() == playerAttackDto.getX() && game.getPlayer1Y() == playerAttackDto.getY()){
                game.setPlayer1health(game.getPlayer1health()-20);
                result = "good attack";
            }else{
                result = "attack missed";
            }
        }
        int player1Health = game.getPlayer1health();
        int player2Health = game.getPlayer2health();
        if (player1Health == 0){
            Player player = playerRepository.findById(game.getPlayerList().get(1).getPlayerId()).get();
            player.setRewardPoints(player.getRewardPoints()+100);
            playerRepository.save(player);
            game.setWinnerId(game.getPlayerList().get(1).getPlayerId());
            result = "game over player 2 wins";
            gameRepository.save(game);
        }if(player2Health == 0){
            Player player = playerRepository.findById(game.getPlayerList().get(0).getPlayerId()).get();
            player.setRewardPoints(player.getRewardPoints()+100);
            playerRepository.save(player);
            game.setWinnerId(game.getPlayerList().get(0).getPlayerId());
            result = "game over player 1 wins";
            gameRepository.save(game);
        }
        return result;
    }
}
