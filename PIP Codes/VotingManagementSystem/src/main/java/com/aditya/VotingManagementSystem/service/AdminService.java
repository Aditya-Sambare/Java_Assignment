package com.aditya.VotingManagementSystem.service;

import com.aditya.VotingManagementSystem.dto.requestDto.AdminRegistrationDto;
import com.aditya.VotingManagementSystem.entities.Admin;

public interface AdminService {
    public Admin registerAdmin(AdminRegistrationDto adminRegistrationDto);
}
