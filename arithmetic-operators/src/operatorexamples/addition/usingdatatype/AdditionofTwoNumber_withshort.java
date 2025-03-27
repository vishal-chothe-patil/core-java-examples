package operatorexamples.addition.usingdatatype;

public class AdditionofTwoNumber_withshort {

    public static void main(String[] args) {

        short num1 = 13;
        short num2 = 25;

        int sum = num1 + num2; // Java converts them to int, performs the addition, and gives you an int result.

        System.out.println("Sum of " + num1 + " + " + num2 + " = " + sum);
    }
}
