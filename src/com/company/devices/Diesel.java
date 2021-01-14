package com.company.devices;

import com.company.Human;

public class Diesel extends Car{
    public Diesel(String model, String producer, Double value, int year) {
        super(model, producer, value, year);
    }
    public Diesel(String model, String producer, Double value, int year, Human owner) {
        super(model, producer, value, year, owner);
    }

    @Override
    void refuel() {

    }
}
