package operatorexamples.ternaryoperater;

import java.util.Scanner;

public class TernaryVotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        String eligible = (age >= 18) ? "You can vote!" : "You cannot vote yet!";
        System.out.println(eligible);
    }
}