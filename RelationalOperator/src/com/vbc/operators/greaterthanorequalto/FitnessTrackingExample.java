package com.vbc.operators.greaterthanorequalto;

import java.util.Scanner;

public class FitnessTrackingExample {
    // Fitness Tracking : Record activity if steps walked exceed or equal a daily goal.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter steps walked today: ");
        int steps = scanner.nextInt();

        System.out.print("Enter daily step goal: ");
        int goal = scanner.nextInt();

        if (steps >= goal) {
            System.out.println("Goal Achieved! Great job!");
        } else {
            System.out.println("Keep Going! You're almost there.");
        }
    }
}
