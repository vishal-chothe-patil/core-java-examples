package com.vbc.operators.notequalto;

import java.util.Scanner;

public class DeviceStatusCheck {
    // Device Status : Notify if a device is not in the "online" state.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter device status: ");
        String status = scanner.nextLine();

        if (!status.equalsIgnoreCase("online")) {
            System.out.println("Alert: Device is not online.");
        } else {
            System.out.println("Device is online.");
        }
    }
}
