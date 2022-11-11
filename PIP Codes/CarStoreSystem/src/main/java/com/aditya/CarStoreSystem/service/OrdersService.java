package com.aditya.CarStoreSystem.service;

import com.aditya.CarStoreSystem.dto.requestDto.AddOrdersDto;
import com.aditya.CarStoreSystem.entities.Orders;

public interface OrdersService {
    public Orders addOrders(AddOrdersDto addOrdersDto);
}
