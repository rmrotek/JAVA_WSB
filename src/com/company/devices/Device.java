package com.company.devices;

public abstract class Device {
    public String model;
    String producer;
    public int yearOfProduction;

    public String toString() {
        return "model " + model + " producer " + producer + " yearOfProduction " + yearOfProduction;
    }

    public abstract void turnOn();
}
