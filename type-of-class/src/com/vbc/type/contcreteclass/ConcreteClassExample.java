package com.vbc.type.contcreteclass;

public class ConcreteClassExample {
    public static void main(String[] args) {

        Vehicle myCar = new Vehicle("Toyota", 2022);
        myCar.startEngine();  // Output: Toyota engine started!
        myCar.displayInfo();  // Output: Brand: Toyota, Year: 2022
    }

    // Concrete class example
    public static class Vehicle {
        private String brand;
        private int year;

        // Concrete constructor
        public Vehicle(String brand, int year) {
            this.brand = brand;
            this.year = year;
        }

        // Concrete methods
        public void startEngine() {
            System.out.println(brand + " engine started!");
        }

        public void displayInfo() {
            System.out.println("Brand: " + brand + ", Year: " + year);
        }

    }
}