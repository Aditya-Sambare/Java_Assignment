package com.aditya.pipEvaluationRound2.repository;

import com.aditya.pipEvaluationRound2.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Integer> {
}
