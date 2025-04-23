package com.vbc.type.innerclasses.anonymous;

interface Greeting {
    void greet();
}

public class AnonymousClassExample {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from anonymous class!");
            }
        };

        greeting.greet();  // Output: Hello from anonymous class!
    }
}