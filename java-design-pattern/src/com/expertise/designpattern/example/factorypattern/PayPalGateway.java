package com.expertise.designpattern.example.factorypattern;

// PayPal payment gateway implementation
public class PayPalGateway implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " via PayPal");
    }
}
