package com.aditya.ConferenceRoomBookingRestApi.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class ViewBookingDto {
    private Date startDate;
    private Date endDate;
}
