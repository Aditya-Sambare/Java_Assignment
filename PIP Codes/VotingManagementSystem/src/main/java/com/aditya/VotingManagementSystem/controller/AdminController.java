package com.aditya.VotingManagementSystem.controller;

import com.aditya.VotingManagementSystem.dto.requestDto.AdminRegistrationDto;
import com.aditya.VotingManagementSystem.entities.Admin;
import com.aditya.VotingManagementSystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
