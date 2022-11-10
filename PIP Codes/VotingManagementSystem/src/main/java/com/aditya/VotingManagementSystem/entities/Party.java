package com.aditya.VotingManagementSystem.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Party {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int partyId;
    @Column(unique = true)
    String partyName;
    @Column(unique = true)
    String partySymbol;
    String partySlogan;
    @OneToMany(mappedBy = "party")
    List<VotingRecords> votingRecordsList;
}
