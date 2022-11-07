package com.aditya.ConferenceRoomBookingRestApi.repository;

import com.aditya.ConferenceRoomBookingRestApi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
