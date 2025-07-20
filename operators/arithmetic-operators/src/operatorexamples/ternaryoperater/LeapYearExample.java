package operatorexamples.ternaryoperater;

import java.util.Scanner;

public class LeapYearExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        boolean isLeap = (year % 400 == 0) || 
                        (year % 100 != 0 && year % 4 == 0);
        
        String result = isLeap ? "a leap year" : "not a leap year";
        System.out.println(year + " is " + result);
    }
}