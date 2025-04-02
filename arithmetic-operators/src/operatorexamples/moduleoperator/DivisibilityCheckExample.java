package operatorexamples.moduleoperator;
import java.util.Scanner;

public class DivisibilityCheckExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor to check: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Cannot divide by zero!");
        } else if (number % divisor == 0) {
            System.out.println(number + " is divisible by " + divisor);
        } else {
            System.out.println(number + " is NOT divisible by " + divisor);
        }
    }
}