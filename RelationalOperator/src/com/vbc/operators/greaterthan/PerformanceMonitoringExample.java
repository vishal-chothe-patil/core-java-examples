package com.vbc.operators.greaterthan;

import java.util.Scanner;

public class PerformanceMonitoringExample {
    // Performance Monitoring : Trigger an alert if CPU usage exceeds 80%.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current CPU usage (%): ");
        int cpuUsage = scanner.nextInt();

        if (cpuUsage > 80) {
            System.out.println("Alert: CPU usage is too high!");
        } else {
            System.out.println("CPU usage is normal.");
        }
    }
}
