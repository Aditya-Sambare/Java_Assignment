package com.aditya.pipEvaluationRound2.repository;

import com.aditya.pipEvaluationRound2.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<Bill,Integer> {
}
