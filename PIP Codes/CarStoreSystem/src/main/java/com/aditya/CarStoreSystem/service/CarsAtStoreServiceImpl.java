package com.aditya.CarStoreSystem.service;

import com.aditya.CarStoreSystem.dto.requestDto.AddCarsDto;
import com.aditya.CarStoreSystem.entities.CarsAtStore;
import com.aditya.CarStoreSystem.repository.CarsAtStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarsAtStoreServiceImpl implements CarsAtStoreService{
    @Autowired
    CarsAtStoreRepository carsAtStoreRepository;
    @Override
    public CarsAtStore addCars(AddCarsDto addCarsDto) {
        CarsAtStore carsAtStore = new CarsAtStore();
        carsAtStore.setCarCategory(addCarsDto.getCarCategory());
        carsAtStore.setCarAvailablity(addCarsDto.getCarAvailablity());
        carsAtStore.setCarPrice(addCarsDto.getCarPrice());
        carsAtStore.setCarModelName(addCarsDto.getCarModelName());
        CarsAtStore carsAtStore1 = carsAtStoreRepository.save(carsAtStore);
        return carsAtStore1;
    }
}
