package com.aditya.VotingManagementSystem.service;

import com.aditya.VotingManagementSystem.dto.requestDto.VoterRegistrationDto;
import com.aditya.VotingManagementSystem.entities.Admin;
import com.aditya.VotingManagementSystem.entities.Registration;
import com.aditya.VotingManagementSystem.entities.Voter;
import com.aditya.VotingManagementSystem.repository.RegistrationRepository;
import com.aditya.VotingManagementSystem.repository.VoterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class VoterServiceImpl implements VoterService{
    @Autowired
    VoterRepository voterRepository;
    @Autowired
    RegistrationRepository registrationRepository;
    @Override
    public Voter registerVoter(VoterRegistrationDto voterRegistrationDto) {
        Voter voter = new Voter();
        Random random = new Random();
        List<Voter> voterList = voterRepository.findAll();
        List<Voter> voterList1 = voterList.stream().filter(s->s.getVoterMobileNumber()==voterRegistrationDto.getVoterMobileNumber() || voterRegistrationDto.getVoterAge() < 18).collect(Collectors.toList());
        if (voterList1.size()>0){
            return null;
        }
int voterID;
String s = "";
        for(int i = 0; i<8; i++){
            s = s+Integer.toString(random.nextInt(10));
        }
voterID = Integer.parseInt(s);
        voter.setVoterId(voterID);
        voter.setVoterAge(voterRegistrationDto.getVoterAge());
        voter.setVoterName(voterRegistrationDto.getVoterName());
        voter.setVoterPassword(voterRegistrationDto.getVoterPassword());
        voter.setVoterMobileNumber(voterRegistrationDto.getVoterMobileNumber());
        Registration registration = new Registration();
        registration.setUserID(voterID);
        registration.setUserRole("Voter");
        registration.setUserPassword(voterRegistrationDto.getVoterPassword());
        registrationRepository.save(registration);
        Voter voter1 = voterRepository.save(voter);
        return voter1;
    }
}
