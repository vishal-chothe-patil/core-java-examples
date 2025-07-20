package com.vbc.operators;

public class StringAppendsExamples {
        /* Pseudocode (Steps):
            - Step 1 : Declare a string variable 'message' and assign it "Welcome".
            - Step 2 : Use the += operator to append " to Java!" to the existing message.
                - message = message + " to Jannat!"
                - So message becomes "Welcome to Jannat!"
            - Step 3 : Print the final message */

    public static void main(String[] args) {
        // Initialize message with `Welcome`
        String message = "Welcome";

        // Append ` to Jannat!` using += operator
        message += " to Jannat!";

        // Print the final message
        System.out.println(message);  // Output: Welcome to Jannat!
    }
}

