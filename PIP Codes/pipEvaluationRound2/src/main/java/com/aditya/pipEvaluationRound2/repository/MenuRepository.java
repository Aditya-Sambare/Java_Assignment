package com.aditya.pipEvaluationRound2.repository;

import com.aditya.pipEvaluationRound2.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Integer> {
}
