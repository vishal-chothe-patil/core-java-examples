package com.vbc.operators.equalto;

import java.util.Scanner;

public class UsernameAuthenticationExample {
    // Authentication : Validate if entered username matches stored username.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String storedUsername = "vishal";

        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();

        if (enteredUsername.equals(storedUsername)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Login Failed: Invalid Username.");
        }
    }
}
