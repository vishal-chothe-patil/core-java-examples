package com.expertise.designpattern.example.factorypattern;

// Razorpay payment gateway implementation
public class RazorpayGateway implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " via Razorpay");
    }
}
