package com.expertise.sorting.example.natural;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// to define default or natural sorting logic inside the class itself.
class Employee implements Comparable<Employee> {
    int id;
    String name;
    String designation;

    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation=designation;
    }

    // Natural order: sort by ID
    @Override
    public int compareTo(Employee otherEmployee) {
        return this.id - otherEmployee.id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(3, "Anil","HR"));
        list.add(new Employee(1, "Bhavesh","Developer"));
        list.add(new Employee(2, "Chetan","Tester"));

        Collections.sort(list); // uses compareTo

        for (Employee emp : list)
            System.out.println(emp);
    }
}
