package com.vbc.operators.greaterthan;

import java.util.Scanner;

public class TemperatureControlExample {
    // Temperature Control : Activate cooling if room temperature exceeds a set point.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter current room temperature (°C): ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter set point temperature (°C): ");
        double setPoint = scanner.nextDouble();

        if (temperature > setPoint) {
            System.out.println("Cooling System Activated.");
        } else {
            System.out.println("Temperature is within safe range.");
        }
    }
}