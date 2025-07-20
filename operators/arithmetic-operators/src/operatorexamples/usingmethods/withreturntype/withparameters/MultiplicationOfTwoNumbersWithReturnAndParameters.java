package operatorexamples.usingmethods.withreturntype.withparameters;

public class MultiplicationOfTwoNumbersWithReturnAndParameters {

    public int multiplyInt(int a, int b) {
        return a * b;
    }

    public long multiplyLong(long x, long y) {
        return x * y;
    }

    public float multiplyFloat(float m, float n) {
        return m * n;
    }

    public double multiplyDouble(double p, double q) {
        return p * q;
    }

    public int multiplyShort(short s1, short s2) {
        return s1 * s2; // Result is promoted to int
    }

    public static void main(String[] args) {
        MultiplicationOfTwoNumbersWithReturnAndParameters multiplyObj = new MultiplicationOfTwoNumbersWithReturnAndParameters();

        int intResult = multiplyObj.multiplyInt(8, 7);
        System.out.println("Multiplication of Integers: 8 * 7 = " + intResult);

        long longResult = multiplyObj.multiplyLong(20L, 15L);
        System.out.println("Multiplication of Longs: 20 * 15 = " + longResult);

        float floatResult = multiplyObj.multiplyFloat(2.5f, 4.0f);
        System.out.println("Multiplication of Floats: 2.5 * 4.0 = " + floatResult);

        double doubleResult = multiplyObj.multiplyDouble(5.5d, 3.3d);
        System.out.println("Multiplication of Doubles: 5.5 * 3.3 = " + doubleResult);

        int shortResult = multiplyObj.multiplyShort((short)6, (short)9);
        System.out.println("Multiplication of Shorts: 6 * 9 = " + shortResult);
    }
}
