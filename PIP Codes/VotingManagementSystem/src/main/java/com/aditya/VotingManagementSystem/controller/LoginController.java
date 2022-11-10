package com.aditya.VotingManagementSystem.controller;

import com.aditya.VotingManagementSystem.dto.requestDto.AdminRegistrationDto;
import com.aditya.VotingManagementSystem.dto.requestDto.LoginDto;
import com.aditya.VotingManagementSystem.dto.responseDto.LoginResponseDto;
import com.aditya.VotingManagementSystem.service.AdminService;
import com.aditya.VotingManagementSystem.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    RegistrationService registrationService;
    @PostMapping("/loginUser")
    public ResponseEntity registerAdmin(@RequestBody LoginDto loginDto) {
        try {
            LoginResponseDto loginResponseDto = registrationService.loginUser(loginDto);
            if (loginResponseDto != null) {
                return new ResponseEntity(Optional.of(loginResponseDto), HttpStatus.ACCEPTED);
            }else{
                return new ResponseEntity(Optional.of("Invalid Crediantials"), HttpStatus.NOT_ACCEPTABLE);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
