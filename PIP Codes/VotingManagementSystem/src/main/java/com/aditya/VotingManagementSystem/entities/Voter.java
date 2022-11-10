package com.aditya.VotingManagementSystem.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class Voter {
    @Id
    int voterId;
    String voterName;
    String voterPassword;
    long voterMobileNumber;
    int voterAge;
    @OneToOne
    VotingRecords votingRecords;
}
