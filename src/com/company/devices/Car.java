package com.company.devices;

public class Car {
    final public String model;
    final String producer;
    public Double value;
    private int year;

    public Car(String model, String producer, Double value) {
        this.model = model;
        this.producer = producer;
        this.year = 2020;
        this.value = value;
    }

    // W poleceniu nie ma zeby napisac override dla equals ale sie pokusilem
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return model.equals(car.model) &&
                producer.equals(car.producer) &&
                value.equals(car.value);
    }

    public String toString() {
        return "model "+ model + " producer " + producer + " value " + value;
    }
}
