package operatorexamples.usingmethods.withoutreturntype.withparameters;

public class MultiplicationOfTwoNumbersWithoutReturnWithParameters {

    public void multiplyInt(int a, int b) {
        System.out.println("Multiplication of Integers: " + a + " * " + b + " = " + (a * b));
    }

    public void multiplyLong(long x, long y) {
        System.out.println("Multiplication of Longs: " + x + " * " + y + " = " + (x * y));
    }

    public void multiplyFloat(float m, float n) {
        System.out.println("Multiplication of Floats: " + m + " * " + n + " = " + (m * n));
    }

    public void multiplyDouble(double p, double q) {
        System.out.println("Multiplication of Doubles: " + p + " * " + q + " = " + (p * q));
    }

    public void multiplyShort(short s1, short s2) {
        System.out.println("Multiplication of Shorts: " + s1 + " * " + s2 + " = " + (s1 * s2));
    }

    public static void main(String[] args) {
        MultiplicationOfTwoNumbersWithoutReturnWithParameters multiplyObj = new MultiplicationOfTwoNumbersWithoutReturnWithParameters();

        multiplyObj.multiplyInt(12, 6);
        multiplyObj.multiplyLong(15L, 4L);
        multiplyObj.multiplyFloat(2.2f, 5.5f);
        multiplyObj.multiplyDouble(3.3d, 7.7d);
        multiplyObj.multiplyShort((short)8, (short)9);
    }
}
