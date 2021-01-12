package com.company.devices;

import com.company.Sellable;

public abstract class Device implements Sellable {
    public String model;
    String producer;
    public int yearOfProduction;

    public String toString() {
        return "model " + model + " producer " + producer + " yearOfProduction " + yearOfProduction;
    }

    public abstract void turnOn();
}
