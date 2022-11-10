package com.aditya.VotingManagementSystem.dto.responseDto;

import lombok.Data;

@Data
public class LoginResponseDto {
    int userID;
    String userPassword;
    String userRole;
}
