package com.aditya.VotingManagementSystem.entities;

import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Data
public class VotingRecords {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int votingRecordsId;
    @OneToOne(cascade = CascadeType.ALL)
    Voter voter;
    @ManyToOne(cascade = CascadeType.ALL)
    Party party;
}
