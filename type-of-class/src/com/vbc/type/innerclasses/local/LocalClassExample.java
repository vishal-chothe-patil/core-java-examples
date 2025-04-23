package com.vbc.type.innerclasses.local;

public class LocalClassExample {
    void display() {
        class Local {
            void print() {
                System.out.println("Inside local class");
            }
        }

        Local local = new Local();
        local.print();
    }

    public static void main(String[] args) {
        LocalClassExample example = new LocalClassExample();
        example.display();  // Output: Inside local class
    }
}