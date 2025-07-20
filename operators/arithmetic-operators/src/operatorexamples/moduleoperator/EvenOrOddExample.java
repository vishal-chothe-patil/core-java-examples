package operatorexamples.moduleoperator;

import java.util.Scanner;

public class EvenOrOddExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Check if a number is even or odd
        System.out.print("\nEnter a number to check if it's even or odd: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}
