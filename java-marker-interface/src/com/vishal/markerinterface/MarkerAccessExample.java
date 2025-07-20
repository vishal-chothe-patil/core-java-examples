package com.vishal.markerinterface;

// Marker interface to tag admin access
interface AdminAccess {
}

// Class with admin access
class AdminUser implements AdminAccess {
    public void performAdminTask() {
        System.out.println("Admin task performed.");
    }
}

// Class without admin access
class NormalUser {
    public void performUserTask() {
        System.out.println("User task performed.");
    }
}

// Main logic to check access using marker
public class MarkerAccessExample {
    public static void main(String[] args) {
        Object[] users = { new AdminUser(), new NormalUser() };

        for (Object user : users) {
            if (user instanceof AdminAccess) {
                System.out.println("Access granted to admin functionality.");
                ((AdminUser) user).performAdminTask();
            } else {
                System.out.println("Access denied to admin functionality.");
            }
        }
    }
}
