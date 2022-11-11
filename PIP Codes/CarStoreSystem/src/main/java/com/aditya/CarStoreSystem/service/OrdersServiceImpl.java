package com.aditya.CarStoreSystem.service;

import com.aditya.CarStoreSystem.dto.requestDto.AddOrdersDto;
import com.aditya.CarStoreSystem.entities.CarsAtStore;
import com.aditya.CarStoreSystem.entities.Customers;
import com.aditya.CarStoreSystem.entities.Orders;
import com.aditya.CarStoreSystem.repository.CarsAtStoreRepository;
import com.aditya.CarStoreSystem.repository.CustomersRepository;
import com.aditya.CarStoreSystem.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    CarsAtStoreRepository carsAtStoreRepository;
    @Autowired
    CustomersRepository customersRepository;
    @Autowired
    OrdersRepository ordersRepository;
    @Override
    public Orders addOrders(AddOrdersDto addOrdersDto) {
        Orders orders = new Orders();
        CarsAtStore carsAtStore = carsAtStoreRepository.findById(addOrdersDto.getCarID()).get();
        Customers customers = customersRepository.findById(addOrdersDto.getCarID()).get();
        orders.setOrderDate(addOrdersDto.getOrderDate());
        orders.setOrderStatus("booked");
        carsAtStore.setCarAvailablity(carsAtStore.getCarAvailablity()-1);
        if (carsAtStore.getCarAvailablity()>0) {
            orders.setOrderDeliveryDate(addOrdersDto.getOrderDate().toString());
        }else{
            Calendar c = Calendar.getInstance();
            c.setTime(addOrdersDto.getOrderDate()); // Using today's date
            c.add(Calendar.DATE, 15); // Adding 5 days
            orders.setOrderDeliveryDate(c.toString());
        }
        orders.setOrderDownPayment(carsAtStore.getCarPrice()/3);
        orders.setOrderPrice(carsAtStore.getCarPrice());
        orders.setCustomers(customers);
        orders.setCarsAtStore(carsAtStore);
        Random random = new Random();

        String s = "";

        for(int i = 0; i<6; i++){
            s = s+Integer.toString(random.nextInt(10));
        }
        int x = Integer.parseInt(s);
        orders.setCarChesisNumber(x);
        Orders orders1 = ordersRepository.save(orders);
        return orders1;
    }
}
