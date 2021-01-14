package com.company.devices;

import com.company.Sellable;

public abstract class Device implements Sellable, Comparable<Device> {
    public String model;
    String producer;
    public int yearOfProduction;
    public Double value;


    public String toString() {
        return "model " + model + " producer " + producer + " yearOfProduction " + yearOfProduction;
    }

    public abstract void turnOn();

    public int getYearOfProduction() {
        return this.yearOfProduction;
    }

    public int compareTo(Device o) {
        return this.yearOfProduction - o.getYearOfProduction();
    }
}
