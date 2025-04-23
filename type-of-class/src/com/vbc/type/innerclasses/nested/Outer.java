package com.vbc.type.innerclasses.nested;

public class Outer {
    private String outerField = "Outer class value";

    class Inner {
        void display() {
            System.out.println("Accessing from inner class: " + outerField);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();  // Output: Accessing from inner class:: Outer class value
    }
}