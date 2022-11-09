package com.aditya.pipEvaluationRound2.dto.requestDto;

import lombok.Data;

@Data
public class TableBookingDto {
    String customerName;
    Long customerMobileNumber;
    int numberOfSeatsRequired;
}
