package com.vbc.operators.lessthanorequalto;

import java.util.Scanner;

public class GradeAssignmentExample {
    // Grade Assignment : Assign "Pass" if a student's score is 40 or less.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's score: ");
        int score = scanner.nextInt();

        if (score <= 40) {
            System.out.println("Grade, Pass");
        } else {
            System.out.println("Grade, Excellent! or Above Average");
        }
    }
}
