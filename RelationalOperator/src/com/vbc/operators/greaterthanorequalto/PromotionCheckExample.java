package com.vbc.operators.greaterthanorequalto;

import java.util.Scanner;

public class PromotionCheckExample {
    // Promotion Check : Promote employees with tenure greater than or equal to five years.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter years of service: ");
        int years = scanner.nextInt();

        if (years >= 5) {
            System.out.println("Eligible for Promotion.");
        } else {
            System.out.println("Not Eligible for Promotion.");
        }
    }
}
