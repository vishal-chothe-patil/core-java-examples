package com.expertise.designpattern.example.factorypattern;

// Factory class to create the appropriate PaymentGateway implementation
public class PaymentGatewayFactory {

    // Static method to return the appropriate object based on input
    public static PaymentGateway getPaymentGateway(String type) {
        if (type == null) return null;

        return switch (type.toLowerCase()) {
            case "razorpay" -> new RazorpayGateway();
            case "paypal" -> new PayPalGateway();
            default -> throw new IllegalArgumentException("Unknown Payment Gateway: " + type);
        };
    }
}
