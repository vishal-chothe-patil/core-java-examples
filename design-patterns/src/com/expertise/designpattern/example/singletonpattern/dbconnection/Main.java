package com.expertise.designpattern.example.singletonpattern.dbconnection;

public class Main {
    public static void main(String[] args) {
        // Get singleton instance and run queries
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.query("SELECT * FROM loan_applications");

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.query("SELECT * FROM emi_payments");

        // Confirm both are the same instance
        System.out.println("Same DB instance? " + (db1 == db2));  // true
    }
}
