package com.expertise.designpattern.example.singletonpattern.filelogger;

public class Main {
    public static void main(String[] args) {
        // Use the singleton logger
        FileLogger logger = FileLogger.getInstance();
        logger.log("Loan application submitted by Vishal");

        FileLogger anotherLogger = FileLogger.getInstance();
        anotherLogger.log("Loan approved by manager");

        // Confirm both loggers are same
        System.out.println("Same Logger instance? " + (logger == anotherLogger));  // true
    }
}
