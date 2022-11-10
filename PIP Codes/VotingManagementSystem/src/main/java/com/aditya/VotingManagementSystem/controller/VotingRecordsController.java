package com.aditya.VotingManagementSystem.controller;

import com.aditya.VotingManagementSystem.dto.requestDto.VoterRegistrationDto;
import com.aditya.VotingManagementSystem.dto.requestDto.VotingRecordDto;
import com.aditya.VotingManagementSystem.entities.Voter;
import com.aditya.VotingManagementSystem.entities.VotingRecords;
import com.aditya.VotingManagementSystem.service.VoterService;
import com.aditya.VotingManagementSystem.service.VotingRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/voting")
public class VotingRecordsController {
    @Autowired
    VotingRecordsService votingRecordsService;
    @PostMapping("/vote")
    public ResponseEntity registerVoter(@RequestBody VotingRecordDto votingRecordDto) {
        try {
            VotingRecords votingRecords = votingRecordsService.recordVote(votingRecordDto);
            if(votingRecords != null) {
                return new ResponseEntity(Optional.of(votingRecords), HttpStatus.ACCEPTED);
            }else{
                return new ResponseEntity(Optional.of("Something Went Wrong"), HttpStatus.NOT_ACCEPTABLE);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
