package com.vbc.operators.greaterthanorequalto;

import java.util.Scanner;

public class StockReplenishmentExample {
    // Stock Replenishment : Trigger restocking if inventory is above reorder level.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter current stock: ");
        int stock = scanner.nextInt();

        System.out.print("Enter reorder level: ");
        int reorderLevel = scanner.nextInt();

        if (stock >= reorderLevel) {
            System.out.println("Stock is sufficient. No need to reorder.");
        } else {
            System.out.println("Reorder stock now.");
        }
    }
}
