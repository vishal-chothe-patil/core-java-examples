package com.vbc.operators;

import java.util.Scanner;

public class PositiveOrNegativeNumber {

    /* Pseudo Code (Steps)
     - Identify the given number is Positive or negative
     - Step 1 : Take input number from user
     - Step 2 : Give condition if (no > 0) number is greater than 0 then it's +ve otherwise -ve.
     - Print that particular message..*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int no = Integer.parseInt(scanner.nextLine());

        if (no > 0){
            System.out.println("Given number is Positive..");
        } else {
            System.out.println("Given number is Negative..");
        }

    }

}
