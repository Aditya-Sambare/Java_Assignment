package com.aditya.CarStoreSystem.repository;

import com.aditya.CarStoreSystem.entities.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends JpaRepository<Customers,Integer> {
}
