package com.aditya.VotingManagementSystem.repository;

import com.aditya.VotingManagementSystem.entities.VotingRecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotingRecordsRepository extends JpaRepository<VotingRecords,Integer> {
}
