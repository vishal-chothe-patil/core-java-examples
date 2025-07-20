package com.expertise.designpattern.example.factorypattern;

// Main class demonstrating the use of Factory Pattern
public class FactoryPatternExample {
    public static void main(String[] args) {
        // Get gateway via factory and use it to process payment
        PaymentGateway gateway1 = PaymentGatewayFactory.getPaymentGateway("razorpay");
        gateway1.processPayment(5000);

        PaymentGateway gateway3 = PaymentGatewayFactory.getPaymentGateway("paypal");
        gateway3.processPayment(1000);
    }
}
