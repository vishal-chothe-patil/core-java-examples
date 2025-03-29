package com.vbc.operators.notequalto;

import java.util.Scanner;

public class DataMismatchDetector {
    // Data Synchronization : Detect mismatches between two datasets.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Dataset A value: ");
        int datasetA = scanner.nextInt();

        System.out.print("Enter Dataset B value: ");
        int datasetB = scanner.nextInt();

        if (datasetA != datasetB) {
            System.out.println("Mismatch Detected!");
        } else {
            System.out.println("Datasets are synchronized.");
        }
    }
}
