package com.vbc.operators.notequalto;

import java.util.Scanner;

public class UserPrivilegeCheck {
    // User Privilege : Restrict access if user roles are not "admin".

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter user role: ");
        String role = scanner.nextLine();

        if (!role.equalsIgnoreCase("admin")) {
            System.out.println("Access Denied: Admins only.");
        } else {
            System.out.println("Access Granted.");
        }
    }
}
