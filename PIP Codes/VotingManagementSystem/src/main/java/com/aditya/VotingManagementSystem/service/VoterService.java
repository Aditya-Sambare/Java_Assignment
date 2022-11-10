package com.aditya.VotingManagementSystem.service;

import com.aditya.VotingManagementSystem.dto.requestDto.AdminRegistrationDto;
import com.aditya.VotingManagementSystem.dto.requestDto.VoterRegistrationDto;
import com.aditya.VotingManagementSystem.entities.Admin;
import com.aditya.VotingManagementSystem.entities.Voter;

public interface VoterService {
    public Voter registerVoter(VoterRegistrationDto voterRegistrationDto);
}
