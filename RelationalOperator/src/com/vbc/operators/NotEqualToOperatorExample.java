package com.vbc.operators;

import java.util.Scanner;

public class NotEqualToOperatorExample {

    /* Pseudocode (Steps)
     - If number is not equal to 100 or not
     - ? print a good number
     - : print a bad number */

    public static void main(String[] args) {
        System.out.println("Enter the value : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (Integer.parseInt(input) != 100) {
            System.out.println("not-matching - its not-century");
        } else {
            System.out.println("matching - its century");
        }
    }

}
