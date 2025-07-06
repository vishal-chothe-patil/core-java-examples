package com.expertise.keywords.example;

import java.io.Serializable;

// 1. Final class - Cannot be subclassed
final class Constants {
    // 2. Final static variable - Acts as a constant (must be initialized once)
    public static final double PI = 3.14159;
    public static final String APP_NAME = "KeywordApp";
}

// 3. Superclass with a final method
class Animal {
    public final void sound() {
        System.out.println("Animal makes sound");
    }
}

// This will give a compile error because Animal.sound() is final
// class Dog extends Animal {
//     @Override
//     public void sound() {
//         System.out.println("Dog barks"); // Cannot override final method
//     }
// }

public class FinalExample implements Serializable {

    // 4. Final instance variable - Must be initialized in constructor or declaration
    final int MAX_USERS;

    // 5. Final static variable - Class-level constant
    public static final String CREATED_BY = "Vishal Chothe";

    // Constructor initializing the final instance variable
    public FinalExample() {
        MAX_USERS = 100;
    }

    // 6. Method using final parameter
    public void printAppDetails(final String version) {
        System.out.println("App: " + Constants.APP_NAME);
        System.out.println("Version: " + version);
        // version = "2.0"; // Cannot modify a final parameter
    }

    public void displayConstants() {
        System.out.println("PI: " + Constants.PI);
        System.out.println("Max Users: " + MAX_USERS);
        System.out.println("Created By: " + CREATED_BY);
    }

    public static void main(String[] args) {
        FinalExample example = new FinalExample();

        // Accessing final constants
        example.displayConstants();

        // Using final method parameter
        example.printAppDetails("1.0");

        // Calling a final method from superclass
        Animal animal = new Animal();
        animal.sound(); // Outputs: Animal makes sound
    }
}
