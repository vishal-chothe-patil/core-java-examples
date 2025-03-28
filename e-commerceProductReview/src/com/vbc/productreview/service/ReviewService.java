package com.vbc.productreview.service;

import com.vbc.productreview.model.Review;

import java.util.Scanner;

// ReviewService class for taking Review details from user input and to store Review details
public class ReviewService {
    Scanner scanner = new Scanner(System.in);

    public Review addReview() {
        System.out.println("Enter Review Details: ");

        System.out.println("\nEnter Review ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("\nEnter Review Heading: ");
        String heading = scanner.nextLine();

        System.out.println("\nEnter Review Description: ");
        String description = scanner.nextLine();

        System.out.println("\nEnter Review Rating: ");
        int rating = scanner.nextInt();

        // Creating Review objects to store Review details
        Review review = new Review();
        review.id = id;
        review.heading = heading;
        review.description = description;
        review.rating = rating;

        return review;
    }
}