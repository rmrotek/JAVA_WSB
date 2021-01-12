package com.company;

public class Animal {
    final String species;
    private Double weight;
    private boolean isAlive = true;


    public Animal(String species) {
        this.species = species;

        switch (species) {
            case "S" -> this.weight = 5.00;
            case "M" -> this.weight = 10.00;
            case "L" -> this.weight = 15.00;
            case "XL" -> this.weight = 20.00;
        }
    }

    void feed() {
        if (this.isAlive) {
            this.weight++;
            System.out.println("Doggo successfully fed - current weight: " + this.weight);
            this.checkIfAlive();
        } else {
            System.out.println("Dead dogs cant eat...");
        }
    }

    void takeForAWalk() {
        if (this.isAlive) {
            this.weight--;
            System.out.println("Doggo successfully taken for a talk - current weight: " + this.weight);
            this.checkIfAlive();
        } else {
            System.out.println("Dead dogs cant walk...");
        }
    }

    void checkIfAlive() {
        if (this.weight <= 0) {
            this.isAlive = false;
            System.out.println("Your Doggo just died you cruel bastard");
        }
    }

    public String toString() {
        return "species " +species + " weight " + weight;
    }
}
