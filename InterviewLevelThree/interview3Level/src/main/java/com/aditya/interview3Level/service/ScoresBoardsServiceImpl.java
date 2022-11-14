package com.aditya.interview3Level.service;

import com.aditya.interview3Level.entities.ScoresBoards;
import com.aditya.interview3Level.repository.ScoresBoardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScoresBoardsServiceImpl implements ScoresBoardsService{
    @Autowired
    ScoresBoardsRepository scoresBoardsRepository;
    @Override
    public List<ScoresBoards> getScores() {
        List<ScoresBoards> scoresBoardsList = scoresBoardsRepository.SortByPoints();
        return scoresBoardsList;
    }
}
