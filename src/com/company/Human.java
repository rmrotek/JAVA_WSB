package com.company;

import java.util.Date;

public class Human {
    Animal pet;
    Car car;
    private Double salary;
    private Date lastDate;
    private Double lastSalary;

    void assignCar(Car carArg) {
        this.car = carArg;
    }

    Double getSalary() {
        System.out.println("Previous salary check: ");
        System.out.println(" date: " + this.lastDate);
        System.out.println(" value: " + this.lastSalary);

        this.lastDate = new Date();
        this.lastSalary = this.salary;

        return this.salary;
    }
    void setSalary(Double newSalary) {
        if (newSalary <= 0){
            System.out.println("Salary has to be a positive value");
        } else {
            System.out.println("New salary saved successfully");
            System.out.println("Government notified");
            this.salary = newSalary;

        }
    }
}
