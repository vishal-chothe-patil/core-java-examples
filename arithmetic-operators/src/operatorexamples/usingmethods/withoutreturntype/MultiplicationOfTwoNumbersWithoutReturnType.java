package operatorexamples.usingmethods.withoutreturntype;

public class MultiplicationOfTwoNumbersWithoutReturnType {

    public void multiInt() {
        int val1 = 8, val2 = 9;
        int result = val1 * val2;
        System.out.println("Multiplication of Two Integers: " + val1 + " * " + val2 + " = " + result);
    }

    public void multiLong() {
        long a = 50L, b = 60L;
        System.out.println("Multiplication of Two Longs: " + a + " * " + b + " = " + (a * b));
    }

    public void multiFloat() {
        float x = 7.5f, y = 2.0f;
        System.out.println("Multiplication of Two Floats: " + x + " * " + y + " = " + (x * y));
    }

    public void multiDouble() {
        double p = 12.5d, q = 4.2d;
        System.out.println("Multiplication of Two Doubles: " + p + " * " + q + " = " + (p * q));
    }

    public void multiShort() {
        short m = 4, n = 5;
        System.out.println("Multiplication of Two Shorts: " + m + " * " + n + " = " + (m * n));
    }

    public static void main(String[] args) {
        MultiplicationOfTwoNumbersWithoutReturnType multiObj = new MultiplicationOfTwoNumbersWithoutReturnType();
        multiObj.multiInt();
        multiObj.multiLong();
        multiObj.multiFloat();
        multiObj.multiDouble();
        multiObj.multiShort();
    }
}
