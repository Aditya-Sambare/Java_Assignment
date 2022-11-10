package com.aditya.VotingManagementSystem.service;

import com.aditya.VotingManagementSystem.dto.requestDto.LoginDto;
import com.aditya.VotingManagementSystem.dto.responseDto.LoginResponseDto;
import com.aditya.VotingManagementSystem.entities.Registration;
import com.aditya.VotingManagementSystem.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService{
    @Autowired
    RegistrationRepository registrationRepository;
    @Override
    public LoginResponseDto loginUser(LoginDto loginDto) {
        List<Registration> registrationList = registrationRepository.FindUserByUserIdAndPassword(loginDto.getUserId(), loginDto.getUserPassword());
        LoginResponseDto loginResponseDto = new LoginResponseDto();
        loginResponseDto.setUserID(registrationList.get(0).getUserID());
        loginResponseDto.setUserPassword(registrationList.get(0).getUserPassword());
        loginResponseDto.setUserRole(registrationList.get(0).getUserRole());
        return loginResponseDto;
    }
}
