package com.vbc.operators;

import java.util.Scanner;

public class IncrementOperatorDemo {
    public static void main(String[] args) {
        // Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Positive Number : ");
        // Read the input as a string and convert it to an integer
        int no = Integer.parseInt(scanner.nextLine());

        System.out.println("Entered value : " + no);

        // make post-increment (no++) and print the incremented value
        no++;
        System.out.println("Increment value (using no++) : " + no);

        // make pre-increment (++no) and print the incremented value
        ++no;
        System.out.println("Next Increment value (using ++no) : " + no);
    }
}
