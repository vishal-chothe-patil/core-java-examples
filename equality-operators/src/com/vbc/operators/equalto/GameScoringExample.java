package com.vbc.operators.equalto;

import java.util.Scanner;

public class GameScoringExample {
    // Game Scoring : Check if a player's score matches a winning target.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int winningScore = 100;

        System.out.print("Enter your score: ");
        int playerScore = scanner.nextInt();

        if (playerScore == winningScore) {
            System.out.println("Congratulations! You won the game!");
        } else {
            System.out.println("Keep trying! Not the winning score.");
        }

        scanner.close();
    }
}
