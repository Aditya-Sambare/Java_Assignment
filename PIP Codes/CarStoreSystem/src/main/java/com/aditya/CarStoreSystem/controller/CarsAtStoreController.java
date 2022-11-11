package com.aditya.CarStoreSystem.controller;

import com.aditya.CarStoreSystem.dto.requestDto.AddCarsDto;
import com.aditya.CarStoreSystem.entities.CarsAtStore;
import com.aditya.CarStoreSystem.service.CarsAtStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarsAtStoreController {
    @Autowired
    CarsAtStoreService carsAtStoreService;
    @PostMapping("/addCars")
    public ResponseEntity addCars(@RequestBody AddCarsDto addCarsDto){
        CarsAtStore carsAtStore = carsAtStoreService.addCars(addCarsDto);
        if (carsAtStore != null){
            return new ResponseEntity(Optional.of(carsAtStore), HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity(Optional.of("Something Went Wrong"),HttpStatus.NOT_ACCEPTABLE);
        }

    }
}
