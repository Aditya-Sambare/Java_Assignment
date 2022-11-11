package com.aditya.CarStoreSystem.controller;

import com.aditya.CarStoreSystem.dto.requestDto.AddCarsDto;
import com.aditya.CarStoreSystem.dto.requestDto.AddCustomerDto;
import com.aditya.CarStoreSystem.entities.CarsAtStore;
import com.aditya.CarStoreSystem.entities.Customers;
import com.aditya.CarStoreSystem.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomersController {
    @Autowired
    CustomersService customersService;
    @PostMapping("/addCustomer")
    public ResponseEntity addCustomer(@RequestBody AddCustomerDto addCustomerDto){
        Customers customers = customersService.addCustomers(addCustomerDto);
        if (customers != null){
            return new ResponseEntity(Optional.of(customers), HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity(Optional.of("Something Went Wrong"),HttpStatus.NOT_ACCEPTABLE);
        }

    }
}
