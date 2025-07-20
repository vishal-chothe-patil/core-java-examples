package com.expertise.designpattern.example.singletonpattern.filelogger;

import java.io.FileWriter;
import java.io.IOException;

// Singleton class for file logging
public class FileLogger {

    private static FileLogger instance;
    private FileWriter writer;

    // Private constructor initializes log file
    private FileLogger() {
        try {
            writer = new FileWriter("audit_log.txt", true); // append mode
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Thread-safe global access point
    public static synchronized FileLogger getInstance() {
        if (instance == null) {
            instance = new FileLogger();
        }
        return instance;
    }

    // Log message to file
    public void log(String message) {
        try {
            writer.write(message + "\n");
            writer.flush();
            System.out.println("Logged: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
