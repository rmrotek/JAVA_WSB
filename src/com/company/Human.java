package com.company;

import java.util.Date;

public class Human {
    Animal pet;
    private Car car;
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
    Car getCar(){
        return this.car;
    }
    void setCar(Car newCar){
        Double carValue = newCar.value;
        Double salary = this.salary;

        if (salary > carValue) {
            System.out.println("Car bought for cash");
            this.car = newCar;
        } else if (salary > carValue/12) {
            System.out.println("Car bought for cash loan");
            this.car = newCar;
        } else {
            System.out.println("You are too poor for this, get a better job");
        }
    }

}
