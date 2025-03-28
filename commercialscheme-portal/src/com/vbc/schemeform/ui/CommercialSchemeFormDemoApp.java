package com.vbc.schemeform.ui;

import com.vbc.schemeform.model.Address;
import com.vbc.schemeform.model.Person;

import java.util.Scanner;

// CommercialSchemeFormDemoApp class to capture and display Person and Address details via console
public class CommercialSchemeFormDemoApp {

    public static void main(String[] args) {
        // To take input from user(command line input) we use scanner
        Scanner sc = new Scanner(System.in);

        // Creating Person and Address objects to store user details
        Person person = new Person();
        Address address = new Address();

        System.out.print("Enter First Name: ");
        person.firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        person.lastName = sc.nextLine();

        System.out.print("Enter Age: ");
        person.age = sc.nextLine();

        System.out.print("Enter House No / Building Name: ");
        address.housenoBuildingName = sc.nextLine();

        System.out.print("Enter Landmark: ");
        address.landmark = sc.nextLine();

        System.out.print("Enter City: ");
        address.city = sc.nextLine();

        System.out.print("Enter Tehsil: ");
        address.tehsil = sc.nextLine();

        System.out.print("Enter District: ");
        address.district = sc.nextLine();

        System.out.print("Enter State: ");
        address.state = sc.nextLine();

        System.out.print("Enter Pincode: ");
        address.pincode = sc.nextInt();

        // Displaying the form data
        System.out.println("\n Commercial Scheme Form ----");
        System.out.println(person);
        System.out.println(address);

    }
}