package com.aditya.interview3Level.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int playerId;
    private String playerName;
    private long mobileNumber;
    private long rewardPoints;
    @OneToOne(cascade = CascadeType.ALL)
    private ScoresBoards scoresBoards;
    @ManyToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Game> gameList;
}
