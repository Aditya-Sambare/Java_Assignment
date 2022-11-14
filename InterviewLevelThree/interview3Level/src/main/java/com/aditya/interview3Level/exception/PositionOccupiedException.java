package com.aditya.interview3Level.exception;

public class PositionOccupiedException extends RuntimeException{
    public PositionOccupiedException() {
        super("Position is Already occupied");
    }
}
