package operatorexamples.ternaryoperater;

import java.util.Scanner;

public class TernaryNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        String type = (num == 0) ? "Zero" : (num > 0) ? "Positive" : "Negative";
        System.out.println("The number is " + type);
    }
}