package operatorexamples.ternaryoperater;

import java.util.Scanner;

public class TernaryMaximumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        int max = (a > b) ? a : b;
        System.out.println("Maximum is: " + max);
    }
}