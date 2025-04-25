package com.vishal.markerinterface.builtin.serialization;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Alice");

        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(emp); // serialize
            out.close();
            fileOut.close();

            System.out.println("Object has been serialized to employee.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
