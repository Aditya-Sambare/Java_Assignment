package com.aditya.ConferenceRoomBookingRestApi.repository;

import com.aditya.ConferenceRoomBookingRestApi.entities.ConferenceRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConferenceRoomRepository extends JpaRepository<ConferenceRoom,Integer> {
}
