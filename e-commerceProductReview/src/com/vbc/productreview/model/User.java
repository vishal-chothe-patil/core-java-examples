package com.vbc.productreview.model;

// User model class with fields  and Use toString() helps convert object data into a clean string for meaningful output
public class User {

    public int id;
    public String firstName;
    public String lastName;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
