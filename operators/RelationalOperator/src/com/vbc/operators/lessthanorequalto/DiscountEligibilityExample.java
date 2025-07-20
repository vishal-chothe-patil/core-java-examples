package com.vbc.operators.lessthanorequalto;

import java.util.Scanner;

public class DiscountEligibilityExample {
    // Discount Eligibility : Offer discounts if total purchase amount is within a specific range.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total purchase amount: ");
        double amount = scanner.nextDouble();

        if (amount <= 1000) {
            System.out.println("Discount Applied, You're eligible!");
        } else {
            System.out.println("No Discount, Amount exceeds discount limit.");
        }
    }
}
