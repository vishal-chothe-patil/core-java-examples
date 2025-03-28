package com.vbc.operators;

public class OrderMattersConcatenation {
        /* Pseudocode (Steps):
         - Step 1 : Declare two integer variables x and y with values 10 and 20.
         - Step 2 Print "Sum: " + x + y → evaluates left to right:
               - First: "Sum: " + x → "Sum: 10"
               - Then: "Sum: 10" + y → "Sum: 1020"
               - So output is a concatenated string, not an arithmetic sum.
         - Step 3 : Print "Sum: " + (x + y) → evaluates inside parentheses first:
               - x + y = 30
               - Then: "Sum: " + 30 → "Sum: 30"
               - So output is the actual sum as part of the string.  */

    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println("Sum: " + x + y);        // Concatenates: "Sum: 1020"
        System.out.println("Sum: " + (x + y));      // Adds first: "Sum: 30"
    }
}
