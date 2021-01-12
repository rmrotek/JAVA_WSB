package com.company.devices;

import com.company.Human;

import java.net.URL;

public class Phone extends Device {
    static final String defaultAddress = "http://www.example.com";
    static final String defaultPort = "1010";
    static final String defaultVersion = "1.0";

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

        if (phone == null) {
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

    public void installAnApp(String appName) {

    }

    public void installAnApp(String appName, String version) {

    }

    public void installAnApp(String appName, String version, String serverAddress) {

    }

    public void installAnApp(String[] appNameList) {

    }

    public void installAnApp(URL url) {

    }
}
