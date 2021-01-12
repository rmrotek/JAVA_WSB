package com.company.devices;

import com.company.Human;

public abstract class Car extends Device {
        public Double value;

    public Car(String model, String producer, Double value) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = 2020;
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

    @Override
    public void turnOn() {
        System.out.println("Car turned on");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        Car car = seller.getCar();
        Double buyerCash = buyer.getCash();

        if (car == null){
            System.out.println("Seller has no car, cant sell");
        } else if (buyerCash < price) {
            System.out.println("Buyer has no monies, cant sell");
        } else {
            buyer.deductCash(price);
            seller.addCash(price);
            seller.assignCar(null); // nie moge uzyc setCar bo sprawdza salary
            buyer.assignCar(car);
            System.out.println("Transaction successful");
        }
    }
    abstract void refuel();
}
