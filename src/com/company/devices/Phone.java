package com.company.devices;

import com.company.Human;

public class Phone extends Device {

    public String toString() {
        return "Hi, im Phone toString method, im an empty class with no fields ;( ";
    }

    @Override
    public void turnOn() {
        System.out.println("Phone turned on");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        Phone phone = seller.getPhone();
        Double buyerCash = buyer.getCash();

        if (phone == null){
            System.out.println("Seller has no phone, cant sell");
        } else if (buyerCash < price) {
            System.out.println("Buyer has no monies, cant sell");
        } else {
            buyer.deductCash(price);
            seller.addCash(price);
            seller.setPhone(null);
            buyer.setPhone(phone);
            System.out.println("Transaction successful");
        }
    }
}
