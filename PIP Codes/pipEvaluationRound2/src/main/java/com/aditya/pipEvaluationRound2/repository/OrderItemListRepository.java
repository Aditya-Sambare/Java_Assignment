package com.aditya.pipEvaluationRound2.repository;

import com.aditya.pipEvaluationRound2.entities.OrderItemList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemListRepository extends JpaRepository<OrderItemList,Integer> {
}
