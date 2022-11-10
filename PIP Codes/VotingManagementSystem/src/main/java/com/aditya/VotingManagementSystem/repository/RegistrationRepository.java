package com.aditya.VotingManagementSystem.repository;

import com.aditya.VotingManagementSystem.entities.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Integer> {
    @Query("select r from Registration r where r.userID = ?1 and r.userPassword = ?2")
    List<Registration> FindUserByUserIdAndPassword(int userID, String userPassword);

}
