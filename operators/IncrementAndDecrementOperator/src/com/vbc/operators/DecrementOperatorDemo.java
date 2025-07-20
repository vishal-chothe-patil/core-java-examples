package com.vbc.operators;

import java.util.Scanner;

public class DecrementOperatorDemo {
    public static void main(String[] args) {
        // Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Positive Number : ");
        int no = Integer.parseInt(scanner.nextLine());

        System.out.println("Entered value : " + no);

        // make post-decrement (no--) and print the decremented value
        no--;
        System.out.println("Decrement value (using no--) : " + no);

        // make pre-decrement (--no) and print the decremented value
        --no;
        System.out.println("Next Decrement value (using --no) : " + no);
    }
}
