package com.aditya.ConferenceRoomBookingRestApi.repository;

import com.aditya.ConferenceRoomBookingRestApi.entities.RoomBookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface RoomBookingsRepository extends JpaRepository<RoomBookings,Integer> {
    @Query("select r from RoomBookings r where r.conferenceRoom.roomId = ?1 and r.bookingDate = ?2")
    List<RoomBookings> bookingsByDateAndRoomID(int roomId, Date bookingDate);


}
