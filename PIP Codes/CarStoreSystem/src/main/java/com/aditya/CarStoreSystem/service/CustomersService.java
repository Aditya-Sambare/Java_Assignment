package com.aditya.CarStoreSystem.service;

import com.aditya.CarStoreSystem.dto.requestDto.AddCustomerDto;
import com.aditya.CarStoreSystem.entities.Customers;

public interface CustomersService {
    public Customers addCustomers(AddCustomerDto addCustomerDto);
}
