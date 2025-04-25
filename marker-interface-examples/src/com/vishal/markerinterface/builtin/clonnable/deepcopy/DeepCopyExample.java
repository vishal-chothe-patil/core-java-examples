package com.vishal.markerinterface.builtin.clonnable.deepcopy;

class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }
}

class Student implements Cloneable {
    int roll;
    String name;
    Address address;

    public Student(int roll, String name, Address address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();          // Shallow copy first
        cloned.address = new Address(this.address.city);   // Deep copy for nested object
        return cloned;
    }
}

public class DeepCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Delhi");
        Student s1 = new Student(101, "Alice", address);
        Student s2 = (Student) s1.clone();

        s2.address.city = "Mumbai"; // changing cloned object's address

        System.out.println("Original Student City: " + s1.address.city); // Not affected
        System.out.println("Cloned Student City: " + s2.address.city);
    }
}
