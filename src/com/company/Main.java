package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Car;
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

        Car simpleCar = new Car("207", "peżot", 2000.00);
        Human simpleHuman = new Human();
        simpleHuman.assignCar(simpleCar);

        //zad 3 i 4
        System.out.println("Current salary: " + simpleHuman.getSalary());
        simpleHuman.setSalary(1500.00);
        System.out.println("Current salary: " + simpleHuman.getSalary());
        simpleHuman.setSalary(-1500.00);
        System.out.println("Current salary: " + simpleHuman.getSalary());

        // zad 5
        Car cheapCar = new Car("cheap", "car", 50.00);
        Car expensiveCar = new Car("expensive", "car", 100000.00);

        simpleHuman.setCar(simpleCar);
        System.out.println("Current car: " + simpleHuman.getCar().model);
        simpleHuman.setCar(cheapCar);
        System.out.println("Current car: " + simpleHuman.getCar().model);
        simpleHuman.setCar(expensiveCar);
        System.out.println("Current car: " + simpleHuman.getCar().model);

        //zad 6
        Car someCar = new Car("some", "car", 50.00);
        Car carEqualToSomeCar = new Car("some", "car", 50.00);
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

        Human sellerHuman = new Human();
        Human buyerHuman = new Human();
        Pet animalToSell = new Pet("dog");
        Phone phoneToSell = new Phone();
        Car carToSell = new Car("model", "producer", 10.00);

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
        sellerHuman.assignCar(carToSell);

        carToSell.sell(sellerHuman, buyerHuman, 100.00); // no cash - fail
        buyerHuman.setCash(200.00);

        carToSell.sell(sellerHuman, buyerHuman, 100.00); // no phone - fail


    }
}
