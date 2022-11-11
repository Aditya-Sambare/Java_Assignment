package com.aditya.CarStoreSystem.dto.requestDto;

import lombok.Data;

@Data
public class AddCarsDto {
    String carModelName;
    float carPrice;
    String carCategory;
    int carAvailablity;
}
