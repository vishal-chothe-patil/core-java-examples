package com.vbc.operators.greaterthanorequalto;

import java.util.Scanner;

public class ExamCutoffCheckExample {
    // Exam Cutoff : Check if a candidate's score meets or exceeds the cutoff for selection.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter candidate's score: ");
        int score = scanner.nextInt();

        System.out.print("Enter exam cutoff: ");
        int cutoff = scanner.nextInt();

        if (score >= cutoff) {
            System.out.println("Qualified for selection.");
        } else {
            System.out.println("Did not meet the cutoff.");
        }
    }
}
