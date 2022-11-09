package com.aditya.pipEvaluationRound2.repository;

import com.aditya.pipEvaluationRound2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
