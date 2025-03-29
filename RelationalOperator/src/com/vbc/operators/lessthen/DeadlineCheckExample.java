package com.vbc.operators.lessthen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DeadlineCheckExample {
    // Deadline Check : Verify if a project completion date is before the due date.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Project Deadline Check - completion date is before the due date");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.print("Enter project completion date (yyyy-MM-dd): ");
        String completionDateStr = scanner.nextLine();
        System.out.print("Enter project due date (yyyy-MM-dd): ");
        String dueDateStr = scanner.nextLine();

        LocalDate completionDate = LocalDate.parse(completionDateStr, formatter);
        LocalDate dueDate = LocalDate.parse(dueDateStr, formatter);

        if (completionDate.isBefore(dueDate)) {
            System.out.println("Project completed before the deadline.\n");
        } else {
            System.out.println("Project was not completed before the deadline.\n");
        }
    }
}
