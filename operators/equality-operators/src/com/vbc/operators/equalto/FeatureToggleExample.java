package com.vbc.operators.equalto;

import java.util.Scanner;

public class FeatureToggleExample {
    // Feature Toggle : Enable features if a specific setting matches "true".

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enable feature? (true/false): ");
        boolean setting = scanner.nextBoolean();

        if (setting == true) {
            System.out.println("Feature Enabled!");
        } else {
            System.out.println("Feature Disabled.");
        }
    }
}
