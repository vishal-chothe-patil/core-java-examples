package operatorexamples.usingmethods.withreturntype.withparameters;

public class DivisionOfTwoNumbersWithReturnTypeAndParameters {

    public int divInt(int a, int b) {
        return a / b;
    }

    public long divLong(long x, long y) {
        return x / y;
    }

    public float divFloat(float m, float n) {
        return m / n;
    }

    public double divDouble(double p, double q) {
        return p / q;
    }

    public int divShort(short s1, short s2) {
        return s1 / s2; // Will be promoted to int automatically
    }

    public static void main(String[] args) {
        DivisionOfTwoNumbersWithReturnTypeAndParameters divObj = new DivisionOfTwoNumbersWithReturnTypeAndParameters();

        int intResult = divObj.divInt(100, 20);
        long longResult = divObj.divLong(400L, 10L);
        float floatResult = divObj.divFloat(45.0f, 5.0f);
        double doubleResult = divObj.divDouble(90.0d, 6.0d);
        int shortResult = divObj.divShort((short)40, (short)8);

        System.out.println("Division of two int Number : " + intResult);
        System.out.println("Division of two long numbers: " + longResult);
        System.out.println("Division of two float numbers:" + floatResult);
        System.out.println("Division of two double numbers:" + doubleResult);
        System.out.println("Division of two short numbers: " + shortResult);

    }
}
