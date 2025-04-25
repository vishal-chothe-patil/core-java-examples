package com.vishal.markerinterface.builtin.serialization.deserialization;

import com.vishal.markerinterface.builtin.serialization.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Employee emp = (Employee) in.readObject(); // deserialize
            in.close();
            fileIn.close();

            System.out.println("Deserialized Employee:");
            System.out.println("ID: " + emp.getId());
            System.out.println("Name: " + emp.getName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
