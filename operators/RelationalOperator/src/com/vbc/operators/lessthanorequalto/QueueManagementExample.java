package com.vbc.operators.lessthanorequalto;

import java.util.Scanner;

public class QueueManagementExample {
    // Queue Management : Accept requests only if queue length is within limits.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter current queue length: ");
        int length = scanner.nextInt();

        System.out.print("Enter maximum allowed length: ");
        int maxLength = scanner.nextInt();

        if (length <= maxLength) {
            System.out.println("Request Accepted, Queue within limit.");
        } else {
            System.out.println("Request Denied, Queue is full.");
        }

        scanner.close();
    }
}
