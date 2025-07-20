package com.vbc.operators;

import java.util.Scanner;

public class PositiveOrNegativeOrZeroNumber {

    /* Pseudo Code (Steps)
     - Identify the given number is Positive or negative or zero
     - Step 1 : Take input number from user
     - Step 2 : Give condition if (no > 0) number is greater than 0 then it's +ve number
      - or Give Condition as (no == 0) number is equal to 0 then its Zero number
      - otherwise remaining -ve number.
     - Print that particular message..*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int no = Integer.parseInt(scanner.nextLine());

        if (no > 0) {
            System.out.println("Given number is Positive..");
        } else if (no == 0) {
            System.out.println("Given number is Zero..");
        } else {
            System.out.println("Given number is Negative..");
        }

    }
}