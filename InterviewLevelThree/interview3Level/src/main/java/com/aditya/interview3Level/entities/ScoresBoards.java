package com.aditya.interview3Level.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ScoresBoards {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int scoresBoardsId;
    int ranks;
    long rewardsPoints;
    @OneToOne(cascade = CascadeType.ALL)
    Player player;
}
