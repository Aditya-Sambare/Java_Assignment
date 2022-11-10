package com.aditya.VotingManagementSystem.service;

import com.aditya.VotingManagementSystem.dto.requestDto.VotingRecordDto;
import com.aditya.VotingManagementSystem.entities.Party;
import com.aditya.VotingManagementSystem.entities.Voter;
import com.aditya.VotingManagementSystem.entities.VotingRecords;
import com.aditya.VotingManagementSystem.repository.PartyRepository;
import com.aditya.VotingManagementSystem.repository.VoterRepository;
import com.aditya.VotingManagementSystem.repository.VotingRecordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VotingRecordsServiceImpl implements VotingRecordsService{
@Autowired
    VotingRecordsRepository votingRecordsRepository;
@Autowired
VoterRepository voterRepository;
@Autowired
PartyRepository partyRepository;
    @Override
    public VotingRecords recordVote(VotingRecordDto votingRecordDto) {
        List<VotingRecords> votingRecordsList = votingRecordsRepository.findAll();
        List<VotingRecords> votingRecordsList1 = votingRecordsList.stream().filter(s->s.getVoter().getVoterId()==votingRecordDto.getVoterId()).collect(Collectors.toList());
        if(votingRecordsList1.size()>0){
            return null;
        }
        VotingRecords votingRecords = new VotingRecords();
        Party party1 = partyRepository.findById(votingRecordDto.getPartyId()).get();
        Voter voter1 = voterRepository.findById(votingRecordDto.getVoterId()).get();
        votingRecords.setParty(party1);
        votingRecords.setVoter(voter1);
        VotingRecords votingRecords1 = votingRecordsRepository.save(votingRecords);
        return votingRecords1;
    }
}
