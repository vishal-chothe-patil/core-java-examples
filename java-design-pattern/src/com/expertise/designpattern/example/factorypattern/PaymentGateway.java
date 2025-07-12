package com.expertise.designpattern.example.factorypattern;

// Common interface that all payment providers will implement
public interface PaymentGateway {
    void processPayment(double amount);  // common method to process payments
}
