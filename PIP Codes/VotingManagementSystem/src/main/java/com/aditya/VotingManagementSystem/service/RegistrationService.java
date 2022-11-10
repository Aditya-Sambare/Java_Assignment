package com.aditya.VotingManagementSystem.service;

import com.aditya.VotingManagementSystem.dto.requestDto.LoginDto;
import com.aditya.VotingManagementSystem.dto.responseDto.LoginResponseDto;

public interface RegistrationService {
    public LoginResponseDto loginUser(LoginDto loginDto);
}
