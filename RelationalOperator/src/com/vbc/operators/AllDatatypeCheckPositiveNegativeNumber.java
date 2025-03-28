package com.vbc.operators;

import java.util.Scanner;

public class AllDatatypeCheckPositiveNegativeNumber {

    /*
     Pseudo Code (Steps):
     - Identify the given number is Positive or negative or Zero
     - Step 1: Take input numbers (int, short, float, double) from user.
     - Step 2: give conditions for each number, - if (no > 0) then given number is positive.
       - if (no == 0) then given number is zero.
       - else given number is negative.
     - Step 3: Print the respective messages for all data types.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input as int and check number
        System.out.println("Enter an Integer value: ");
        int intNo = Integer.parseInt(scanner.nextLine());
        checkNumber(intNo, "Integer");

        // User input as short and check number
        System.out.println("Enter a Short value: ");
        short shortNo = Short.parseShort(scanner.nextLine());
        checkNumber(shortNo, "Short");

        // User input as float and check number
        System.out.println("Enter a Float value: ");
        float floatNo = Float.parseFloat(scanner.nextLine());
        checkNumber(floatNo, "Float");

        // User input as double and check number
        System.out.println("Enter a Double value: ");
        double doubleNo = Double.parseDouble(scanner.nextLine());
        checkNumber(doubleNo, "Double");

    }

    // Created Particular methods (Overloaded methods) to handle different data types
    public static void checkNumber(int no, String type) {
        if (no > 0) {
            System.out.println(type + " given number is Positive.");
        } else if (no == 0) {
            System.out.println(type + " given number is Zero.");
        } else {
            System.out.println(type + " given number is Negative.");
        }
    }

    public static void checkNumber(short no, String type) {
        if (no > 0) {
            System.out.println(type + " given number is Positive.");
        } else if (no == 0) {
            System.out.println(type + " given number is Zero.");
        } else {
            System.out.println(type + " given number is Negative.");
        }
    }

    public static void checkNumber(float no, String type) {
        if (no > 0) {
            System.out.println(type + " given number is Positive.");
        } else if (no == 0) {
            System.out.println(type + " givenn umber is Zero.");
        } else {
            System.out.println(type + " given number is Negative.");
        }
    }

    public static void checkNumber(double no, String type) {
        if (no > 0) {
            System.out.println(type + " given number is Positive.");
        } else if (no == 0) {
            System.out.println(type + " given number is Zero.");
        } else {
            System.out.println(type + " given number is Negative.");
        }
    }
}
