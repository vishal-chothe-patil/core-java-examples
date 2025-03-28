package com.vbc.productreview.service;


import com.vbc.productreview.model.User;

import java.util.Scanner;

// UserService class for taking user details from user input and to store User details
public class UserService {
    Scanner scanner = new Scanner(System.in);

    public User addUser() {
        System.out.println("Enter User Details: ");

        System.out.println("\nEnter User ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("\nEnter User firstName: ");
        String firstName = scanner.nextLine();

        System.out.println("\nEnter User lastName: ");
        String lastName = scanner.nextLine();

        // Creating Review objects to store Review details
        User user = new User();
        user.id = id;
        user.firstName = firstName;
        user.lastName = lastName;

        return user;
    }
}