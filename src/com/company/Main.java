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

        Car simpleCar = new Car("207", "peżot");
        Human simpleHuman = new Human();
        simpleHuman.assignCar(simpleCar);
    }
}
