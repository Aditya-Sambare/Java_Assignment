package com.aditya.CarStoreSystem.exception;

public class CarNotFoundException extends RuntimeException {
    public CarNotFoundException() {
        super("car not found with the given Id");
    }
}