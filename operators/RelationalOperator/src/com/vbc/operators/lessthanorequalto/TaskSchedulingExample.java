package com.vbc.operators.lessthanorequalto;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TaskSchedulingExample {
    // Task Scheduling : Assign tasks with deadlines on or before the current date.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter task deadline (yyyy-MM-dd): ");
        String deadlineInput = scanner.nextLine();
        LocalDate deadline = LocalDate.parse(deadlineInput, formatter);
        LocalDate today = LocalDate.now();

        if (deadline.isBefore(today) || deadline.isEqual(today)) {
            System.out.println("Task Assigned, Deadline is valid.");
        } else {
            System.out.println("Task Postponed, Deadline is in the future.");
        }
    }
}
