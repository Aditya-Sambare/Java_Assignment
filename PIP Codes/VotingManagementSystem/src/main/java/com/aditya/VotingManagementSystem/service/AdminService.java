package com.aditya.VotingManagementSystem.service;

import com.aditya.VotingManagementSystem.dto.requestDto.AdminRegistrationDto;
import com.aditya.VotingManagementSystem.entities.Admin;
import com.aditya.VotingManagementSystem.entities.VotingRecords;

import java.util.List;

public interface AdminService {
    public Admin registerAdmin(AdminRegistrationDto adminRegistrationDto);
    public List<VotingRecords> getVotingRecords();
}
