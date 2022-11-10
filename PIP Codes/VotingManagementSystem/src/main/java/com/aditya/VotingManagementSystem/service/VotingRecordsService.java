package com.aditya.VotingManagementSystem.service;

import com.aditya.VotingManagementSystem.dto.requestDto.VotingRecordDto;
import com.aditya.VotingManagementSystem.entities.VotingRecords;

public interface VotingRecordsService {
    public VotingRecords recordVote(VotingRecordDto votingRecordDto);
}
