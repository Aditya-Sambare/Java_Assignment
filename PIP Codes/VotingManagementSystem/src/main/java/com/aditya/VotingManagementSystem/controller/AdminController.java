package com.aditya.VotingManagementSystem.controller;

import com.aditya.VotingManagementSystem.dto.requestDto.AdminRegistrationDto;
import com.aditya.VotingManagementSystem.entities.Admin;
import com.aditya.VotingManagementSystem.entities.VotingRecords;
import com.aditya.VotingManagementSystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;
    @PostMapping("/registerAdmin")
    public ResponseEntity registerAdmin(@RequestBody AdminRegistrationDto adminRegistrationDto) {
        try {
            Admin admin = adminService.registerAdmin(adminRegistrationDto);
            if (admin != null) {
                return new ResponseEntity(Optional.of(admin), HttpStatus.ACCEPTED);
            }else{
                return new ResponseEntity(Optional.of("Something Went Wrong"), HttpStatus.NOT_ACCEPTABLE);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/viewVotingsRecords")
    public ResponseEntity viewVotingRecords() {
        try {
            List<VotingRecords> votingRecordsList = adminService.getVotingRecords();
            if (votingRecordsList.size() > 0) {
                return new ResponseEntity(Optional.of(votingRecordsList), HttpStatus.ACCEPTED);
            }else{
                return new ResponseEntity(Optional.of("No records Available"), HttpStatus.NOT_ACCEPTABLE);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
