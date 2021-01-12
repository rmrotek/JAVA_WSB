package com.company.devices;

public class Phone extends Device {

    public String toString() {
        return "Hi, im Phone toString method, im an empty class with no fields ;( ";
    }

    @Override
    public void turnOn() {
        System.out.println("Phone turned on");
    }
}
