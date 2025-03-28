package com.vbc.operators;

import java.util.Scanner;

public class StringConcatenationExample {
    // concat = connect two string
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first String : ");
        String firstString = scanner.nextLine();
        System.out.println("Enter the second String : ");
        String secondString = scanner.nextLine();

        // as we take 1st String as `Vishal` and 2nd String `Chothe` - Output Must be `VishalChothe`
        System.out.println("String Concatenation Output : " + firstString + secondString);

    }
}
