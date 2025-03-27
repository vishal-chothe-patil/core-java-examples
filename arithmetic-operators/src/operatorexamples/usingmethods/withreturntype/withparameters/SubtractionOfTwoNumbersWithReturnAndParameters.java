package operatorexamples.usingmethods.withreturntype.withparameters;

public class SubtractionOfTwoNumbersWithReturnAndParameters {

    public int subInt(int a, int b) {
        return a - b;
    }

    public long subLong(long x, long y) {
        return x - y;
    }

    public float subFloat(float m, float n) {
        return m - n;
    }

    public double subDouble(double p, double q) {
        return p - q;
    }

    public int subShort(short s1, short s2) {
        return s1 - s2; // Result is promoted to int
    }

    public static void main(String[] args) {
        SubtractionOfTwoNumbersWithReturnAndParameters subObj = new SubtractionOfTwoNumbersWithReturnAndParameters();

        int intResult = subObj.subInt(80, 35);
        System.out.println("Subtraction of Integers: 80 - 35 = " + intResult);

        long longResult = subObj.subLong(1200L, 450L);
        System.out.println("Subtraction of Longs: 1200 - 450 = " + longResult);

        float floatResult = subObj.subFloat(50.5f, 20.2f);
        System.out.println("Subtraction of Floats: 50.5 - 20.2 = " + floatResult);

        double doubleResult = subObj.subDouble(150.75d, 49.25d);
        System.out.println("Subtraction of Doubles: 150.75 - 49.25 = " + doubleResult);

        int shortResult = subObj.subShort((short)40, (short)15);
        System.out.println("Subtraction of Shorts: 40 - 15 = " + shortResult);
    }
}
