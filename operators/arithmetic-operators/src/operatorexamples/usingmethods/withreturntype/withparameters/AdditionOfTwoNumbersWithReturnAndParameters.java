package operatorexamples.usingmethods.withreturntype.withparameters;

public class AdditionOfTwoNumbersWithReturnAndParameters {

    public int addInt(int a, int b) {
        return a + b;
    }

    public long addLong(long x, long y) {
        return x + y;
    }

    public float addFloat(float m, float n) {
        return m + n;
    }

    public double addDouble(double p, double q) {
        return p + q;
    }

    public int addShort(short s1, short s2) {
        return s1 + s2; // Result promoted to int
    }

    public static void main(String[] args) {
        AdditionOfTwoNumbersWithReturnAndParameters addObj = new AdditionOfTwoNumbersWithReturnAndParameters();

        int intResult = addObj.addInt(15, 35);
        System.out.println("Addition of Integers: 15 + 35 = " + intResult);

        long longResult = addObj.addLong(500L, 700L);
        System.out.println("Addition of Longs: 500 + 700 = " + longResult);

        float floatResult = addObj.addFloat(12.5f, 7.5f);
        System.out.println("Addition of Floats: 12.5 + 7.5 = " + floatResult);

        double doubleResult = addObj.addDouble(33.3d, 66.7d);
        System.out.println("Addition of Doubles: 33.3 + 66.7 = " + doubleResult);

        int shortResult = addObj.addShort((short)10, (short)20);
        System.out.println("Addition of Shorts: 10 + 20 = " + shortResult);
    }
}
