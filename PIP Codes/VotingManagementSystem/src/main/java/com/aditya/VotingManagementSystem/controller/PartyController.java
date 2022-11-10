package com.aditya.VotingManagementSystem.controller;

import com.aditya.VotingManagementSystem.dto.requestDto.AdminRegistrationDto;
import com.aditya.VotingManagementSystem.dto.requestDto.PartyRegistrationDto;
import com.aditya.VotingManagementSystem.entities.Admin;
import com.aditya.VotingManagementSystem.entities.Party;
import com.aditya.VotingManagementSystem.service.AdminService;
import com.aditya.VotingManagementSystem.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/party")
public class PartyController {
    @Autowired
    PartyService partyService;
    @PostMapping("/registerParty")
    public ResponseEntity registerAdmin(@RequestBody PartyRegistrationDto partyRegistrationDto) {
        try {
            Party party = partyService.registerParty(partyRegistrationDto);
            if (party != null) {
                return new ResponseEntity(Optional.of(party), HttpStatus.ACCEPTED);
            }else{
                return new ResponseEntity(Optional.of("Something Went Wrong"), HttpStatus.NOT_ACCEPTABLE);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
