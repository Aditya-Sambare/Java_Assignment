package com.aditya.VotingManagementSystem.repository;

import com.aditya.VotingManagementSystem.entities.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRepository extends JpaRepository<Party,Integer> {
}
