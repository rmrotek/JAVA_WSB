package com.company;

public class Car {
    final String model;
    final String producer;
    private int year;
    Double value;


    public Car(String model, String producer, Double value) {
        this.model = model;
        this.producer = producer;
        this.year = 2020;
        this.value = value;
    }
}
