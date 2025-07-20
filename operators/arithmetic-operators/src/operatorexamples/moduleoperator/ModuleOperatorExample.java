package operatorexamples.moduleoperator;

import java.util.Scanner;

public class ModuleOperatorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input to enter two numbers
        System.out.print("Enter the first number (dividend): ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the second number (divisor): ");
        int divisor = scanner.nextInt();

        // Calculate the remainder using the modulo operator
        int remainder = dividend % divisor;

        System.out.println("The remainder of " + dividend + " divided by " + divisor + " is: " + remainder);
    }
}