package com.vbc.operators.equalto;

import java.util.Scanner;

public class SystemStatusCheck {
    // Status Check : Determine if a system is in the "ready" state.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter system status: ");
        String status = scanner.nextLine();

        if (status.equals("ready")) {
            System.out.println("System is ready to start.");
        } else {
            System.out.println("System is not ready.");
        }
    }
}
