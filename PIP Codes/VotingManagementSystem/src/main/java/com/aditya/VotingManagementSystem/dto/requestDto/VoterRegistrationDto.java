package com.aditya.VotingManagementSystem.dto.requestDto;

import lombok.Data;

@Data
public class VoterRegistrationDto {
    String voterName;
    String voterPassword;
    long voterMobileNumber;
    int voterAge;
}
