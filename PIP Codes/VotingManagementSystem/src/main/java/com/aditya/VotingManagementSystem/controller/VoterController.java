package com.aditya.VotingManagementSystem.controller;

import com.aditya.VotingManagementSystem.dto.requestDto.AdminRegistrationDto;
import com.aditya.VotingManagementSystem.dto.requestDto.VoterRegistrationDto;
import com.aditya.VotingManagementSystem.entities.Voter;
import com.aditya.VotingManagementSystem.service.AdminService;
import com.aditya.VotingManagementSystem.service.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/voter")
public class VoterController {

    @Autowired
    VoterService voterService;
    @PostMapping("/registerVoter")
    public ResponseEntity registerVoter(@RequestBody VoterRegistrationDto voterRegistrationDto) {
        try {
            Voter voter =voterService.registerVoter(voterRegistrationDto);
            System.out.println(voter);
            if(voter != null) {
                return new ResponseEntity(Optional.of(voter), HttpStatus.ACCEPTED);
            }else{
                return new ResponseEntity(Optional.of("Something Went Wrong "), HttpStatus.NOT_ACCEPTABLE);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
