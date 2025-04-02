package operatorexamples.moduleoperator;

import java.util.Scanner;

public class FizzBizzExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = (num % 15 == 0) ? "FizzBuzz" :
                (num % 3 == 0)  ? "Fizz" :
                        (num % 5 == 0)  ? "Buzz" :
                                String.valueOf(num);

        System.out.println(result);
    }
}