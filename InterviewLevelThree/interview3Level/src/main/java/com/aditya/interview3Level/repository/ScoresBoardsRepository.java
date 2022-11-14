package com.aditya.interview3Level.repository;

import com.aditya.interview3Level.entities.ScoresBoards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoresBoardsRepository extends JpaRepository<ScoresBoards, Integer> {
    @Query("select s from ScoresBoards s order by s.rewardsPoints DESC")
    List<ScoresBoards> SortByPoints();

}
