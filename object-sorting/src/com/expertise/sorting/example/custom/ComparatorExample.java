package com.expertise.sorting.example.custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}

// to define custom sorting logic outside the class, or use multiple sorting criteria.
public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(3, "Chiv"));
        list.add(new Employee(1, "Baba"));
        list.add(new Employee(2, "Anna"));

        Collections.sort(list, new NameComparator());

        for (Employee emp : list)
            System.out.println(emp);
    }
}
