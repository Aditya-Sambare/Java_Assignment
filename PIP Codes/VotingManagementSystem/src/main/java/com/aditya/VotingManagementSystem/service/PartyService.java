package com.aditya.VotingManagementSystem.service;

import com.aditya.VotingManagementSystem.dto.requestDto.PartyRegistrationDto;
import com.aditya.VotingManagementSystem.entities.Party;

public interface PartyService {
    public Party registerParty(PartyRegistrationDto partyRegistrationDto);
}
