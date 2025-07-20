package com.vbc.operators.greaterthan;

import java.util.Scanner;

public class ScoringSystemExample {
    // Scoring System : Verify if a candidate's score surpasses a benchmark.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter candidate's score: ");
        int score = scanner.nextInt();

        System.out.print("Enter benchmark score: ");
        int benchmark = scanner.nextInt();

        if (score > benchmark) {
            System.out.println("Congratulations! You exceeded the benchmark.");
        } else {
            System.out.println("You did not surpass the benchmark.");
        }
    }
}

