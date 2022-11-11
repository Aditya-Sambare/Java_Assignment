package com.aditya.VotingManagementSystem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Party {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int partyId;
    @Column(unique = true)
    String partyName;
    @Column(unique = true)
    String partySymbol;
    String partySlogan;
    @OneToMany(mappedBy = "party")
    @JsonIgnore
    List<VotingRecords> votingRecordsList;
}
