package operatorexamples.usingmethods.withoutreturntype.withparameters;

public class SubtractionOfTwoNumbersWithoutReturnWithParameters {

    public void subInt(int a, int b) {
        System.out.println("Subtraction of Integers: " + a + " - " + b + " = " + (a - b));
    }

    public void subLong(long x, long y) {
        System.out.println("Subtraction of Longs: " + x + " - " + y + " = " + (x - y));
    }

    public void subFloat(float m, float n) {
        System.out.println("Subtraction of Floats: " + m + " - " + n + " = " + (m - n));
    }

    public void subDouble(double p, double q) {
        System.out.println("Subtraction of Doubles: " + p + " - " + q + " = " + (p - q));
    }

    public void subShort(short s1, short s2) {
        System.out.println("Subtraction of Shorts: " + s1 + " - " + s2 + " = " + (s1 - s2));
    }

    public static void main(String[] args) {
        SubtractionOfTwoNumbersWithoutReturnWithParameters subObj = new SubtractionOfTwoNumbersWithoutReturnWithParameters();

        subObj.subInt(50, 20);
        subObj.subLong(1000L, 450L);
        subObj.subFloat(25.5f, 10.0f);
        subObj.subDouble(99.9d, 44.4d);
        subObj.subShort((short)30, (short)12);
    }
}
