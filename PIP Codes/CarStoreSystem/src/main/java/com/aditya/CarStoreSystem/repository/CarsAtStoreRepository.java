package com.aditya.CarStoreSystem.repository;

import com.aditya.CarStoreSystem.entities.CarsAtStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsAtStoreRepository extends JpaRepository<CarsAtStore,Integer> {
}
