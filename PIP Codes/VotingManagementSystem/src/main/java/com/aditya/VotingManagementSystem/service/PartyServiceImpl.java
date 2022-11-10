package com.aditya.VotingManagementSystem.service;

import com.aditya.VotingManagementSystem.dto.requestDto.PartyRegistrationDto;
import com.aditya.VotingManagementSystem.entities.Party;
import com.aditya.VotingManagementSystem.repository.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PartyServiceImpl implements PartyService{
    @Autowired
    PartyRepository partyRepository;
    @Override
    public Party registerParty(PartyRegistrationDto partyRegistrationDto) {
        List<Party> partyList = partyRepository.findAll();
        List<Party> partyList1 = partyList.stream().filter(s->s.getPartyName().toLowerCase().trim().contains(partyRegistrationDto.getPartyName().toLowerCase().trim()) || s.getPartySlogan().toLowerCase().trim().contains(partyRegistrationDto.getPartySlogan().toLowerCase().trim()) ).collect(Collectors.toList());
        if (partyList1.size()>0){
            return null;
        }
        Party party = new Party();
        party.setPartyName(partyRegistrationDto.getPartyName());
        party.setPartySlogan(partyRegistrationDto.getPartySlogan());
        party.setPartySymbol(partyRegistrationDto.getPartySymbol());
        Party party1 = partyRepository.save(party);
        return party1;
    }
}
