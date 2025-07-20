package com.expertise.designpattern.example.singletonpattern.dbconnection;

// Singleton class for managing DB connection
public class DatabaseConnection {

    // Static instance (single shared object)
    private static DatabaseConnection instance;

    // Private constructor to restrict instantiation
    private DatabaseConnection() {
        System.out.println("Connected to FinTech DB");
    }

    // Global access point (thread-safe)
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();  // create only once
        }
        return instance;
    }

    // Sample DB query method
    public void query(String sql) {
        System.out.println("Executing SQL: " + sql);
    }
}