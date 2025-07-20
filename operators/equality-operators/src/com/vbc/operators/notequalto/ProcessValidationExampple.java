package com.vbc.operators.notequalto;

import java.util.Scanner;

public class ProcessValidationExampple {
    // Process Validation : Skip processes if input values are not equal to default values.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int defaultValue = 0;

        System.out.print("Enter input value: ");
        int inputValue = scanner.nextInt();

        if (inputValue != defaultValue) {
            System.out.println("Skipping process: Input doesn't match default value.");
        } else {
            System.out.println("Processing with default value.");
        }
    }
}
