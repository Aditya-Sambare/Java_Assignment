package com.aditya.CarStoreSystem.controller;

import com.aditya.CarStoreSystem.dto.requestDto.AddOrdersDto;
import com.aditya.CarStoreSystem.entities.Orders;
import com.aditya.CarStoreSystem.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrdersController {
    @Autowired
    OrdersService ordersService;
    @PostMapping("/addOrder")
    public ResponseEntity addOrders(@RequestBody AddOrdersDto addOrdersDto){
        Orders orders = ordersService.addOrders(addOrdersDto);
        if (orders != null){
            return new ResponseEntity(Optional.of(orders), HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity(Optional.of("Something Went Wrong"),HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
