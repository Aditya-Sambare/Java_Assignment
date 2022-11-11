package com.aditya.CarStoreSystem.service;

import com.aditya.CarStoreSystem.dto.requestDto.AddCustomerDto;
import com.aditya.CarStoreSystem.entities.Customers;
import com.aditya.CarStoreSystem.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersServiceImpl implements CustomersService{
    @Autowired
    CustomersRepository customersRepository;
    @Override
    public Customers addCustomers(AddCustomerDto addCustomerDto) {
        Customers customers = new Customers();
        customers.setCustomerName(addCustomerDto.getCustomerName());
        Customers customers1 = customersRepository.save(customers);
        return customers1;

    }
}
