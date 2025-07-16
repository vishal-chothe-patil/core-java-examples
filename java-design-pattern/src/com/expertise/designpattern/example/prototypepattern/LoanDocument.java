package com.expertise.designpattern.example.prototypepattern;

// Concrete class that implements the prototype
public class LoanDocument implements DocumentPrototype {

    private String documentName;
    private String content;

    public LoanDocument(String documentName, String content) {
        this.documentName = documentName;
        this.content = content;
    }

    // Copy constructor (used in cloning)
    private LoanDocument(LoanDocument original) {
        this.documentName = original.documentName;
        this.content = original.content;
    }

    // Implements clone method
    @Override
    public LoanDocument clone() {
        return new LoanDocument(this);  // deep copy via constructor
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return " [" + documentName + "] Content: " + content;
    }
}
