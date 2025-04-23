package com.vbc.type.record;

public record Person(String name, int age) {
    public static void main(String[] args) {
        Person person = new Person("Vishal", 25);
        System.out.println(person);  // Output: Person[name=Vishal, age=25]
        System.out.println("Name: " + person.name());  // Output: Name: Vishal
        System.out.println("Age: " + person.age());     // Output: Age: 25
    }
}