package com.company;

public class Animal implements Sellable {
    final String species;
    private Double weight;
    private boolean isAlive = true;


    public Animal(String species) {
        this.species = species;

        switch (species) {
            case "mouse" -> this.weight = 5.00;
            case "cat" -> this.weight = 10.00;
            case "dog" -> this.weight = 15.00;
            case "big dog" -> this.weight = 20.00;
        }
    }

    void feed() {
        if (this.isAlive) {
            this.weight++;
            System.out.println("Animal successfully fed - current weight: " + this.weight);
            this.checkIfAlive();
        } else {
            System.out.println("Dead animals cant eat...");
        }
    }

    void takeForAWalk() {
        if (this.isAlive) {
            this.weight--;
            System.out.println("Animal successfully taken for a talk - current weight: " + this.weight);
            this.checkIfAlive();
        } else {
            System.out.println("Dead animals cant walk...");
        }
    }

    void checkIfAlive() {
        if (this.weight <= 0) {
            this.isAlive = false;
            System.out.println("Your animal just died you cruel bastard");
        }
    }

    public String toString() {
        return "species " +species + " weight " + weight;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        Animal pet = seller.getPet();
        Double buyerCash = buyer.getCash();

        if (pet == null){
            System.out.println("Seller has no pet, cant sell");
        } else if (buyerCash < price) {
            System.out.println("Buyer has no monies, cant sell");
        } else {
            buyer.deductCash(price);
            seller.addCash(price);
            seller.setPet(null);
            buyer.setPet(pet);
            System.out.println("Transaction successful");
        }
    }
}
