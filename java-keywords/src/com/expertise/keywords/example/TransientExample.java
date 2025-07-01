package com.expertise.keywords.example;

import java.io.*;

class User implements Serializable {
    String name;
    transient String password;

    User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}

/* Transient keyword is used to indicate that a field should not be serialized when an object is converted into a byte stream.
     (e.g., during serialization using ObjectOutputStream). */
public class TransientExample {
    public static void main(String[] args) throws Exception {
        User user = new User("Vishal", "secret123");

        // Serialize
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.ser"));
        out.writeObject(user);
        out.close();

        // Deserialize
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.ser"));
        User deserializedUser = (User) in.readObject();
        in.close();

        System.out.println("Name: " + deserializedUser.name);       // Vishal
        System.out.println("Password: " + deserializedUser.password); // null (transient)
    }
}
