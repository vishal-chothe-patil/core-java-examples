package com.vishal.markerinterface.builtin.clonnable;

class Student implements Cloneable {
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }
}

public class CloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(101, "Bob");
        Student s2 = (Student) s1.clone();

        System.out.println("Original: " + s1.name);
        System.out.println("Cloned: " + s2.name);
    }
}
