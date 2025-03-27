package operatorexamples.usingmethods.withreturntype;

public class SubtractionOfTwoNumbersWithReturnType {

    public int subInt() {
        int val1 = 50, val2 = 20;
        return val1 - val2;
    }

    public long subLong() {
        long a = 1000L, b = 450L;
        return a - b;
    }

    public float subFloat() {
        float x = 75.5f, y = 33.2f;
        return x - y;
    }

    public double subDouble() {
        double p = 999.99d, q = 123.45d;
        return p - q;
    }

    public int subShort() {
        short m = 30, n = 10;
        return m - n; // returns int due to type promotion
    }

    public static void main(String[] args) {
        SubtractionOfTwoNumbersWithReturnType subObj = new SubtractionOfTwoNumbersWithReturnType();

        int intResult = subObj.subInt();
        System.out.println("Subtraction of Two Integers = " + intResult);

        long longResult = subObj.subLong();
        System.out.println("Subtraction of Two Longs = " + longResult);

        float floatResult = subObj.subFloat();
        System.out.println("Subtraction of Two Floats = " + floatResult);

        double doubleResult = subObj.subDouble();
        System.out.println("Subtraction of Two Doubles = " + doubleResult);

        int shortResult = subObj.subShort();
        System.out.println("Subtraction of Two Shorts = " + shortResult);
    }
}
