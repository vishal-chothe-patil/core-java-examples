package com.vbc.operators.greaterthan;

import java.util.Scanner;

public class AttendenceCheckExample {
 //  Attendance Check : Ensure participants in an event exceed a required number.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of participants: ");
        int participants = scanner.nextInt();

        System.out.print("Enter required number: ");
        int required = scanner.nextInt();

        if (participants > required) {
            System.out.println("Event Ready for Enough participants have joined.");
        } else {
            System.out.println("Waiting for Not enough participants.");
        }
    }
}