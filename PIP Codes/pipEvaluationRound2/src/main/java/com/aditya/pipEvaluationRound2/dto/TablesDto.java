package com.aditya.pipEvaluationRound2.dto;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;
@Data
public class TablesDto {
    private int tableId;
    private String tableName;
    private int tableSeats;
    private Date tableBookingDate;
    private Time tableBookingTime;
}
