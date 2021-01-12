package com.company;

public class Main {

    public static void main(String[] args) {

        // zad 1
        Animal smallDog = new Animal("S");

        smallDog.feed();
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
        Car cheapCar = new Car("cheap" ,"car", 50.00);
        Car expensiveCar = new Car("expensive" ,"car", 100000.00);

        simpleHuman.setCar(simpleCar);
        System.out.println("Current car: " + simpleHuman.getCar().model);
        simpleHuman.setCar(cheapCar);
        System.out.println("Current car: " + simpleHuman.getCar().model);
        simpleHuman.setCar(expensiveCar);
        System.out.println("Current car: " + simpleHuman.getCar().model);

    }
}
