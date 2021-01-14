package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.Phone;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Human {
    Animal pet;
    private Car[] garage;
    private Phone phone;
    private Double salary;
    private Date lastDate;
    private Double lastSalary;
    private Double cash;

    public Human(Double salary, Double cash) {
        this.salary = salary;
        this.cash = cash;
        this.garage = new Car[]{new Diesel("model1", "prod1", 1500.00, 2000), new Electric("model2", "prod2", 2500.00, 1900)};
    }

    public Human(Double salary, Double cash, int garageCapacity) {
        this.salary = salary;
        this.cash = cash;
        this.garage = new Car[garageCapacity];
    }


    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Animal getPet() {
        return this.pet;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Phone getPhone() {
        return this.phone;
    }

    public void deductCash(Double cash) {
        this.cash -= cash;
    }

    public void addCash(Double cash) {
        this.cash += cash;
    }

    public Double getCash() {
        return this.cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
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
        if (newSalary <= 0) {
            System.out.println("Salary has to be a positive value");
        } else {
            System.out.println("New salary saved successfully");
            System.out.println("Government notified");
            this.salary = newSalary;

        }
    }

    public Car getCar(int index) {
        return this.garage[index];
    }

    public Car[] getGarage() {
        return this.garage;
    }

    public void setCar(Car newCar, int index) {
        Double carValue = newCar.value;
        Double salary = this.salary;

        if (salary > carValue) {
            System.out.println("Car bought for cash");
            this.garage[index] = newCar;
        } else if (salary > carValue / 12) {
            System.out.println("Car bought for cash loan");
            this.garage[index] = newCar;
        } else {
            System.out.println("You are too poor for this, get a better job");
        }
    }

    public String toString() {
        return "salary: " + salary + " garage " + garage;
    }

    public Double getGarageValue() {
        Double valueSum = 0.0;

        for (Car car : garage) {
            if (car != null) {
                valueSum += car.value;
            }

        }
        return valueSum;
    }

    public void sortCars() {
        System.out.println("Garage before sort " + Arrays.asList(garage));
        Arrays.sort(garage);
        System.out.println("Garage after sort " + Arrays.asList(garage));

    }

}
