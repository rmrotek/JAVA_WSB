package com.company;

import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Diesel;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        // zad 1
        Pet smallDog = new Pet("mouse");

        smallDog.feed();
        smallDog.feed(0.1); // zad9
        smallDog.takeForAWalk();
        smallDog.takeForAWalk();
        smallDog.takeForAWalk();
        smallDog.takeForAWalk();
        smallDog.takeForAWalk();
        smallDog.takeForAWalk();
        smallDog.takeForAWalk();
        smallDog.feed();

        //zad 2

        Car simpleCar = new Diesel("207", "peżot", 2000.00, 2000);
        Human simpleHuman = new Human(5000.00, 1500.00); // zad 11

        //zad 3 i 4
        System.out.println("Current salary: " + simpleHuman.getSalary());
        simpleHuman.setSalary(1500.00);
        System.out.println("Current salary: " + simpleHuman.getSalary());
        simpleHuman.setSalary(-1500.00);
        System.out.println("Current salary: " + simpleHuman.getSalary());

        // zad 5
        Car cheapCar = new Diesel("cheap", "car", 50.00, 2000);
        Car expensiveCar = new Diesel("expensive", "car", 100000.00, 2000);

        // kontynuacja zad 5 + pozniejsze zad 11
        simpleHuman.setCar(simpleCar, 0);
        System.out.println("Current car: " + simpleHuman.getCar(0).model);
        simpleHuman.setCar(cheapCar, 0);
        System.out.println("Current car: " + simpleHuman.getCar(0).model);
        simpleHuman.setCar(expensiveCar, 0);
        System.out.println("Current car: " + simpleHuman.getCar(0).model);

        //zad 6
        Car someCar = new Diesel("some", "car", 50.00, 2000);
        Car carEqualToSomeCar = new Diesel("some", "car", 50.00, 2000);
        System.out.println("someCar: " + someCar);
        System.out.println("carEqualToSomeCar: " + carEqualToSomeCar);
        System.out.println("Compare same cars " + someCar.equals(carEqualToSomeCar)); // bez equals override bedzie false

        Phone phone = new Phone();
        System.out.println("Doggo " + smallDog.toString());
        System.out.println("Human " + simpleHuman.toString());
        System.out.println("Car " + simpleCar.toString());
        System.out.println("Phone " + phone.toString());

        // zad 7
        phone.turnOn();
        simpleCar.turnOn();

        // zad 8

        Human sellerHuman = new Human(5000.00, 1500.00); // zad 11
        Human buyerHuman = new Human(5000.00, 1500.00); // zad 11
        Pet animalToSell = new Pet("dog");
        Phone phoneToSell = new Phone();
        Car carToSell = new Diesel("model", "producer", 10.00, 2000);

        // sell animal
        animalToSell.sell(sellerHuman, buyerHuman, 100.00); // no pet - fail
        sellerHuman.setPet(animalToSell);

        animalToSell.sell(sellerHuman, buyerHuman, 100.00); // no cash - fail
        buyerHuman.setCash(200.00);

        animalToSell.sell(sellerHuman, buyerHuman, 100.00); // success

        // sell phone
        phoneToSell.sell(sellerHuman, buyerHuman, 100.00); // no phone - fail
        sellerHuman.setPhone(phoneToSell);

        phoneToSell.sell(sellerHuman, buyerHuman, 100.00); // success

        phoneToSell.sell(sellerHuman, buyerHuman, 100.00); // no phone - fail

        // sell car
        carToSell.sell(sellerHuman, buyerHuman, 100.00); // no car - fail
        sellerHuman.setCar(carToSell, 0);

        carToSell.sell(sellerHuman, buyerHuman, 100.00); // no cash - fail
        buyerHuman.setCash(200.00);

        carToSell.sell(sellerHuman, buyerHuman, 100.00); // no phone - fail


        // zad 11
        Human humanDefault = new Human(5000.00, 4000.00);
        Human humanGarage = new Human(5000.00, 4000.00, 4);

        System.out.println("Garage value: " + humanDefault.getGarageValue());
        System.out.println("Garage value: " + humanGarage.getGarageValue());
        humanDefault.sortCars();

        Car anotherCarToSell = new Diesel("model1", "prod1", 1500.00, 2000); // taki sam jak domyslny u Humana

        anotherCarToSell.sell(humanDefault, humanGarage, 100.0);
    }
}
