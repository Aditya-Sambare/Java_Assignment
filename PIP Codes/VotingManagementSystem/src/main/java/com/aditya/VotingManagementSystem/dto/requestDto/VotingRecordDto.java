package com.aditya.VotingManagementSystem.dto.requestDto;

import com.aditya.VotingManagementSystem.entities.Party;
import com.aditya.VotingManagementSystem.entities.Voter;
import lombok.Data;

import javax.persistence.ManyToOne;

@Data
public class VotingRecordDto {
    int voterId;
    int partyId;
}
