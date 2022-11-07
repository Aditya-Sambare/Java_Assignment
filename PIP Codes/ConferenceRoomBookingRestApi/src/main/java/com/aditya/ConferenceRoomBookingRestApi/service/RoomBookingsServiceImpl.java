package com.aditya.ConferenceRoomBookingRestApi.service;

import com.aditya.ConferenceRoomBookingRestApi.dto.BookingDto;
import com.aditya.ConferenceRoomBookingRestApi.dto.ViewBookingDto;
import com.aditya.ConferenceRoomBookingRestApi.entities.ConferenceRoom;
import com.aditya.ConferenceRoomBookingRestApi.entities.RoomBookings;
import com.aditya.ConferenceRoomBookingRestApi.entities.User;
import com.aditya.ConferenceRoomBookingRestApi.repository.ConferenceRoomRepository;
import com.aditya.ConferenceRoomBookingRestApi.repository.RoomBookingsRepository;
import com.aditya.ConferenceRoomBookingRestApi.repository.UserRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.Query;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RoomBookingsServiceImpl implements RoomBookingsService{
    @Autowired
    RoomBookingsRepository roomBookingsRepository;
    @Autowired
    ConferenceRoomRepository conferenceRoomRepository;
    @Autowired
    UserRepository userRepository;
    @Override
    public ResponseEntity addRoomBooking(BookingDto bookingDto) {
        RoomBookings roomBookings = new RoomBookings();
        User user=userRepository.findById(bookingDto.getUserId()).get();
        roomBookings.setBookingDate(bookingDto.getBookingDate());
        roomBookings.setEndingTime(bookingDto.getEndingTime());
        roomBookings.setBookingStatus("booked");
        roomBookings.setStartingTime(bookingDto.getStartingTime());
        roomBookings.setUser(user);
        ConferenceRoom conferenceRoom=conferenceRoomRepository.findById(bookingDto.getRoomId()).get();
        roomBookings.setConferenceRoom(conferenceRoom);
        String result = null;
        List<RoomBookings> roomBookingsList = roomBookingsRepository.bookingsByDateAndRoomID(roomBookings.getConferenceRoom().getRoomId(), roomBookings.getBookingDate());
        boolean exists = false;
        if (roomBookingsList.size()==0){
            roomBookings.setBookingStatus("booked");
            RoomBookings roomBookings1 = roomBookingsRepository.save(roomBookings);
            if (roomBookings1 == null){
                return new ResponseEntity<>(Optional.of("Booking not done"), HttpStatus.NOT_ACCEPTABLE);
            }else{
                return new ResponseEntity(Optional.of(roomBookings1),HttpStatus.CREATED);
            }
        }else{
            for(int i = 0; i < roomBookingsList.size(); i++){
                if((roomBookings.getStartingTime().after(roomBookingsList.get(i).getStartingTime()) &&
                        roomBookings.getStartingTime().before(roomBookingsList.get(i).getEndingTime()))
                        ||(roomBookings.getEndingTime().after(roomBookingsList.get(i).getStartingTime()) &&
                        roomBookings.getEndingTime().before(roomBookingsList.get(i).getEndingTime()))
                        ||(roomBookings.getStartingTime().before(roomBookingsList.get(i).getStartingTime())&&
                        roomBookings.getEndingTime().after(roomBookingsList.get(i).getEndingTime()))||
                        bookingDto.getStartingTime().equals(roomBookingsList.get(i).getStartingTime())||
                        bookingDto.getEndingTime().equals(roomBookingsList.get(i).getEndingTime()))
                {
                    if(roomBookingsList.get(i).getBookingStatus().equals("cancelled")){
                        exists = true;
                    }else {
                        exists = false;
                        break;
                    }
                }else{
                    exists = true;
                }
            }
            if (exists){
                roomBookings.setBookingStatus("booked");
                RoomBookings roomBookings1 = roomBookingsRepository.save(roomBookings);
                if (roomBookings1 == null){
                    return new ResponseEntity<>(Optional.of("Booking not done"), HttpStatus.NOT_ACCEPTABLE);
                }else{
                    return new ResponseEntity(Optional.of(roomBookings1),HttpStatus.CREATED);
                }
            }else {
                return new ResponseEntity<>(Optional.of("Booking not done"), HttpStatus.NOT_ACCEPTABLE);
            }
        }
    }

    @Override
    public ResponseEntity cancelRoomBooking(int id) {
        RoomBookings roomBooking = roomBookingsRepository.findById(id).get();
        roomBooking.setBookingStatus("cancelled");
        RoomBookings roomBookings = roomBookingsRepository.save(roomBooking);
        if (roomBookings==null){
            return new ResponseEntity<>(Optional.of("Booking not done"), HttpStatus.NOT_ACCEPTABLE);
        }else {
            return new ResponseEntity<>(Optional.of(roomBookings),HttpStatus.ACCEPTED);
        }
    }

    @Override
    public ResponseEntity viewRoomBookings(ViewBookingDto viewBookingDto) {
        List<RoomBookings> roomBookingList = new ArrayList<>();
        List<RoomBookings> roomBookingList1=roomBookingsRepository.findAll();
        roomBookingList = roomBookingList1.stream().filter(s->s.getBookingDate().after(viewBookingDto.getStartDate())&&s.getBookingDate().before(viewBookingDto.getEndDate())).collect(Collectors.toList());
        if (roomBookingList == null){
            return new ResponseEntity(Optional.of("Something Went Wrong"),HttpStatus.NOT_ACCEPTABLE);
    }else{
            return  new ResponseEntity(Optional.of(roomBookingList),HttpStatus.ACCEPTED);
        }
    }
    @Override
    public ResponseEntity viewRoomAvailability(BookingDto bookingDto) {
        List<ConferenceRoom> conferenceRoomList = conferenceRoomRepository.findAll();
        List<RoomBookings> roomBookingList = roomBookingsRepository.findBookingByDate(bookingDto.getBookingDate());
        if (roomBookingList.size()==0){
            return new ResponseEntity<>(Optional.of(conferenceRoomList),HttpStatus.ACCEPTED);
        }else {
            for(int i = 0; i < roomBookingList.size(); i++){
                if((bookingDto.getStartingTime().after(roomBookingList.get(i).getStartingTime())
                        && bookingDto.getStartingTime().before(roomBookingList.get(i).getEndingTime()))
                        ||(bookingDto.getEndingTime().after(roomBookingList.get(i).getStartingTime())
                        && bookingDto.getEndingTime().before(roomBookingList.get(i).getEndingTime()))
                        ||(bookingDto.getStartingTime().before(roomBookingList.get(i).getStartingTime())&&
                        bookingDto.getEndingTime().after(roomBookingList.get(i).getEndingTime())) ||
                        bookingDto.getStartingTime().equals(roomBookingList.get(i).getStartingTime())||
                        bookingDto.getEndingTime().equals(roomBookingList.get(i).getEndingTime()))
                {
                    if (roomBookingList.get(i).getBookingStatus().equals("booked")) {
                        int id = roomBookingList.get(i).getConferenceRoom().getRoomId();
                        if(conferenceRoomList.stream().anyMatch(s->s.getRoomId()==id))
                        {
                            ConferenceRoom conferenceRoom=conferenceRoomList.stream().filter(s->s.getRoomId()==id).findFirst().get();
                            conferenceRoomList.remove(conferenceRoom);
                        }

                    }
                }
            }
        }
        return new ResponseEntity<>(Optional.of(conferenceRoomList),HttpStatus.ACCEPTED);
    }
}
