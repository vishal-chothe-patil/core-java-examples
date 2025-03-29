package com.vbc.operators.greaterthanorequalto;

import java.util.Scanner;

public class ScholarshipEligibilityExample {
    // Eligibility Criteria : Verify if a student qualifies for a scholarship based on marks.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's marks: ");
        int marks = scanner.nextInt();

        if (marks >= 85) {
            System.out.println("Eligible for Scholarship.");
        } else {
            System.out.println("Not Eligible for Scholarship.");
        }
    }
}
