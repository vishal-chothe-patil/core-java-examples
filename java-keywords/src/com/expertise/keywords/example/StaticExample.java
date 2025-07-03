package com.expertise.keywords.example;

public class StaticExample {

    // 1. Static variable: shared among all instances
    static int count = 0;

    // 2. Static constant (final + static)
    static final String COMPANY_NAME = "KillerExpertise";

    // 3. Instance variable: separate for each object
    String name;

    // Constructor to increase static counter
    public StaticExample(String name) {
        this.name = name;
        count++; // shared static field
    }

    // 4. Static method: can be called without creating object
    public static void showCount() {
        System.out.println("Total objects created: " + count);
    }

    // 5. Instance method: can access both static and non-static members
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Company: " + COMPANY_NAME); // accessing static constant
    }

    // 6. Static inner class: can exist without outer class instance
    static class Helper {
        public void printHelperMessage() {
            System.out.println("This is a static inner class.");
        }
    }

    // Main method to demonstrate all static usages
    public static void main(String[] args) {
        // Static method call without object
        StaticExample.showCount(); // Output: 0

        // Create 2 instances
        StaticExample e1 = new StaticExample("Raja");
        StaticExample e2 = new StaticExample("Rani");

        // Access instance method
        e1.displayDetails();
        e2.displayDetails();

        // Access static method again
         StaticExample.showCount(); // Output: 2

        // Access static variable directly (Not recommended - better via class name)
        System.out.println("Static variable: " + count); // 2

        // Static inner class usage
        StaticExample.Helper helper = new StaticExample.Helper();
        helper.printHelperMessage();
    }
}
