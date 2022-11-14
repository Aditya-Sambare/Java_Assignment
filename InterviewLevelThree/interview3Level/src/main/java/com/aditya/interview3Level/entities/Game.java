package com.aditya.interview3Level.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gameId;
    private int player1health;
    private int player2health;
    private int player1X;
    private int player1Y;
    private int player2X;
    private int player2Y;
    private int winnerId;
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "gameList")
    @JsonIgnore
    private List<Player> playerList;


}
