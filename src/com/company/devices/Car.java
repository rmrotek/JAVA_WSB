package com.company.devices;

import com.company.Human;

import java.util.Arrays;

public abstract class Car extends Device {

    private Human[] carOwners;

       public Car(String model, String producer, Double value, int yearOfProduction, Human owner) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
        this.carOwners = new Human[]{owner};
    }

    public Car(String model, String producer, Double value, int year) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = year;
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
        return "model " + model + " producer " + producer + " yearOfProduction " + yearOfProduction + " value " + value + " owners " + carOwners;
    }

    @Override
    public void turnOn() {
        System.out.println("Car turned on");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        Double buyerCash = buyer.getCash();
        Car[] sellerGarage = seller.getGarage();
        Car[] buyerGarage = buyer.getGarage();
        int sellerCarSpot = -1;
        for (int i = 0; i < sellerGarage.length; i++) {
            if (this.equals(sellerGarage[i])) {
                sellerCarSpot = i;
                break;
            }
        }
        int buyerFreeSpot = -1;

        for (int i = 0; i < buyerGarage.length; i++) {
            if (buyerGarage[i] == null) {
                buyerFreeSpot = i;
                break;
            }
        }

        if (sellerCarSpot < 0) {
            System.out.println("Seller has no car, cant sell");
        } else if (buyerFreeSpot < 0) {
            System.out.println("Buyer has no room in garage, cant sell");
        } else if (buyerCash < price) {
            System.out.println("Buyer has no monies, cant sell");
        } else {
            buyer.deductCash(price);
            buyerGarage[buyerFreeSpot] = this;
            seller.addCash(price);
            sellerGarage[sellerCarSpot] = null;
            System.out.println("Transaction successful");

            System.out.println("Seller Garage" + Arrays.toString(sellerGarage));
            System.out.println("Buyer Garage" + Arrays.toString(buyerGarage));

        }
    }

    abstract void refuel();
}
