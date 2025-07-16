package com.expertise.designpattern.example.prototypepattern;

// Main class demonstrating prototype usage
public class PrototypePatternExample {
    public static void main(String[] args) {

        // Original loan document template
        LoanDocument baseTemplate = new LoanDocument("Personal Loan Terms", 
                "Interest: 12%, Tenure: 24 months");

        // Clone for Customer A
        LoanDocument customerADoc = baseTemplate.clone();
        customerADoc.setContent("Interest: 10%, Tenure: 36 months");  // customize

        // Clone for Customer B
        LoanDocument customerBDoc = baseTemplate.clone();
        customerBDoc.setContent("Interest: 11%, Tenure: 18 months");  // customize

        // Display all documents
        System.out.println(baseTemplate);    // base template
        System.out.println(customerADoc);    // customized clone
        System.out.println(customerBDoc);    // customized clone
    }
}
