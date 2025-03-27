package operatorexamples.usingmethods.withreturntype;

public class MultiplicationOfTwoNumbersWithReturnType {

    public int multiInt() {
        int val1 = 6, val2 = 7;
        return val1 * val2;
    }

    public long multiLong() {
        long a = 25L, b = 40L;
        return a * b;
    }

    public float multiFloat() {
        float x = 5.5f, y = 4.0f;
        return x * y;
    }

    public double multiDouble() {
        double p = 10.5d, q = 3.2d;
        return p * q;
    }

    public int multiShort() {
        short m = 5, n = 6;
        return m * n; // short * short promoted to int
    }

    public static void main(String[] args) {
        MultiplicationOfTwoNumbersWithReturnType multiObj = new MultiplicationOfTwoNumbersWithReturnType();

        int intResult = multiObj.multiInt();
        System.out.println("Multiplication of Two Integers = " + intResult);

        long longResult = multiObj.multiLong();
        System.out.println("Multiplication of Two Longs = " + longResult);

        float floatResult = multiObj.multiFloat();
        System.out.println("Multiplication of Two Floats = " + floatResult);

        double doubleResult = multiObj.multiDouble();
        System.out.println("Multiplication of Two Doubles = " + doubleResult);

        int shortResult = multiObj.multiShort();
        System.out.println("Multiplication of Two Shorts = " + shortResult);
    }
}
