package com.aditya.CarStoreSystem.service;

import com.aditya.CarStoreSystem.dto.requestDto.AddCarsDto;
import com.aditya.CarStoreSystem.entities.CarsAtStore;

public interface CarsAtStoreService {
    public CarsAtStore addCars(AddCarsDto addCarsDto);
}
