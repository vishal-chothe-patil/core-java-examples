package com.vbc.operators.greaterthan;

import java.util.Scanner;

public class BankBalanceCheckValidation {
    // Bank Balance Validation : Check if a withdrawal amount exceeds the current balance.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter current account balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double withdrawal = scanner.nextDouble();

        if (withdrawal > balance) {
            System.out.println("Transaction Failed: Insufficient Balance, and Your Current Amount is "+balance);
        } else {
            System.out.println("Transaction Successful.");
        }
    }
}


