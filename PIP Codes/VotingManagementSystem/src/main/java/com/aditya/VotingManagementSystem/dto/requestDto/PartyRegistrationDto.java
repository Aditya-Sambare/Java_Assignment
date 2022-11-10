package com.aditya.VotingManagementSystem.dto.requestDto;

import lombok.Data;

import javax.persistence.Column;
@Data
public class PartyRegistrationDto {
    String partyName;
    String partySymbol;
    String partySlogan;
}
