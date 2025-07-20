package com.vbc.operators.notequalto;

import java.util.Scanner;

public class FileFormatChecker {
    // Error Detection : Trigger an alert if a file format is not supported.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String supportedFormat = "pdf";

        System.out.print("Enter file format: ");
        String fileFormat = scanner.nextLine();

        if (!fileFormat.equalsIgnoreCase(supportedFormat)) {
            System.out.println("Error: Unsupported file format!");
        } else {
            System.out.println("File format supported.");
        }
    }
}
