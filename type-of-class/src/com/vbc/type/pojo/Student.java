package com.vbc.type.pojo;

public class Student {
    private String name;
    private int age;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vishal");
        student.setAge(25);

        System.out.println(student.getName() + " is " +
                student.getAge() + " years old.");
        // Output: Vishal is 25 years old.
    }
}