package com.vbc.operators.lessthan;

import java.util.Scanner;

public class StockMonitoringExample {
    // Stock Monitoring: Alert if inventory falls below a minimum threshold.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Stock :");
        int stock = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Minimum Threshold :");
        int minThreshold = Integer.parseInt(scanner.nextLine());

        if (stock < minThreshold) {
            System.out.println("Alert: Stock is below the minimum threshold.");
        } else {
            System.out.println("Stock level is sufficient.");
        }

    }
}
