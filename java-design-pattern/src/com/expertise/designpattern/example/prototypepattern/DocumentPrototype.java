package com.expertise.designpattern.example.prototypepattern;

// Common prototype interface
public interface DocumentPrototype extends Cloneable {
    DocumentPrototype clone();  // method to clone object
}
