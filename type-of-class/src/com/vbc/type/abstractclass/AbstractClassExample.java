package com.vbc.type.abstractclass;

public class AbstractClassExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();  // Output: Woof, woof!
        myDog.breathe();    // Output: Breathing...
    }

    // Abstract Class Example
    abstract static class Animal {
        abstract void makeSound();

        void breathe() {
            System.out.println("Breathing...");
        }
    }

    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Woof woof!");
        }
    }
}