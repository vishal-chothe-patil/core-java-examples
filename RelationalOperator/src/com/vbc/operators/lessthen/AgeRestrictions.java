package com.vbc.operators.lessthen;

import java.util.Scanner;

public class AgeRestrictions {
    // Age Restriction : Check if a user is too young to access specific content.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age : ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Access Denied: You must be at least 18 years old.");
        } else {
            System.out.println("Access Granted. you explore now..");
        }

    }
}
