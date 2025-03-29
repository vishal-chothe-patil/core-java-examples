package com.vbc.operators.lessthan;

import java.util.Scanner;

public class GradingExample {
    // Grading : Determine if a score is below a passing grade.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Score :");
        double score = Double.parseDouble(scanner.nextLine());

        if (score < 35) {
            System.out.println("Your Result is Fail. Minimum 35 marks required to pass.");
        } else {
            System.out.println("Your Result is Pass");
        }

    }
}
