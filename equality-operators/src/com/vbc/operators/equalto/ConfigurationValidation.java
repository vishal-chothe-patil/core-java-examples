package com.vbc.operators.equalto;

import java.util.Scanner;

public class ConfigurationValidation {
    // Configuration Validation : Verify if the loaded configuration matches the expected setup.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int expectedConfig = 42;

        System.out.print("Enter loaded configuration code: ");
        int loadedConfig = scanner.nextInt();

        if (loadedConfig == expectedConfig) {
            System.out.println("Configuration Valid.");
        } else {
            System.out.println("Configuration Mismatch.");
        }
    }
}
