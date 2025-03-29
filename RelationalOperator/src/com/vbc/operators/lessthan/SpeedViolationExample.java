package com.vbc.operators.lessthan;

import java.util.Scanner;

public class SpeedViolationExample {
    // Speed Violation : Detect if a vehicle's speed is below the minimum limit for a highway.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Speed Violation Check ");

        System.out.print("Enter vehicle speed (km/h): ");
        int speed = scanner.nextInt();

        if (speed < 60) {
            System.out.println("\nWarning: Speed is below the minimum highway limit.");
        } else {
            System.out.println("\nSpeed is within the acceptable range.");
        }
    }
}
