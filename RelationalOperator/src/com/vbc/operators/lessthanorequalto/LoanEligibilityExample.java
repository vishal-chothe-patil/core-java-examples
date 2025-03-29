package com.vbc.operators.lessthanorequalto;

import java.util.Scanner;

public class LoanEligibilityExample {
    // Loan Eligibility : Approve loans if the applicant's age is less than or equal to 60.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter applicant's age: ");
        int age = scanner.nextInt();

        if (age <= 60) {
            System.out.println("Loan Approved, Age within eligible range.");
        } else {
            System.out.println("Loan Rejected, Age exceeds limit.");
        }
    }
}
