package com.aditya.CarStoreSystem.dto.requestDto;

import lombok.Data;

import java.sql.Date;

@Data
public class AddOrdersDto {
    int carID;
    int customerId;
    Date orderDate;
}
