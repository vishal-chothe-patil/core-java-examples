package operatorexamples.usingmethods.withreturntype;

public class DivisionOfTwoNumbersWithReturnType {

    public int divInt() {
        int a = 50, b = 5;
        return a / b;
    }

    public long divLong() {
        long x = 100L, y = 10L;
        return x / y;
    }

    public float divFloat() {
        float m = 22.5f, n = 4.5f;
        return m / n;
    }

    public double divDouble() {
        double p = 45.0d, q = 6.0d;
        return p / q;
    }

    public int divShort() {
        short s1 = 18, s2 = 3;
        return s1 / s2; // result is promoted to int
    }

    public static void main(String[] args) {
        DivisionOfTwoNumbersWithReturnType divObj = new DivisionOfTwoNumbersWithReturnType();

        int intResult = divObj.divInt();
        System.out.println("Division of Two Integers = " + intResult);

        long longResult = divObj.divLong();
        System.out.println("Division of Two Longs = " + longResult);

        float floatResult = divObj.divFloat();
        System.out.println("Division of Two Floats = " + floatResult);

        double doubleResult = divObj.divDouble();
        System.out.println("Division of Two Doubles = " + doubleResult);

        int shortResult = divObj.divShort();
        System.out.println("Division of Two Shorts = " + shortResult);
    }
}
