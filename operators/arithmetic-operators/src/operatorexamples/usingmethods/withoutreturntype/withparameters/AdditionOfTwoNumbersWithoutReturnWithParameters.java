package operatorexamples.usingmethods.withoutreturntype.withparameters;

public class AdditionOfTwoNumbersWithoutReturnWithParameters {

    public void addInt(int a, int b) {
        System.out.println("Addition of Integers: " + a + " + " + b + " = " + (a + b));
    }

    public void addLong(long x, long y) {
        System.out.println("Addition of Longs: " + x + " + " + y + " = " + (x + y));
    }

    public void addFloat(float m, float n) {
        System.out.println("Addition of Floats: " + m + " + " + n + " = " + (m + n));
    }

    public void addDouble(double p, double q) {
        System.out.println("Addition of Doubles: " + p + " + " + q + " = " + (p + q));
    }

    public void addShort(short s1, short s2) {
        System.out.println("Addition of Shorts: " + s1 + " + " + s2 + " = " + (s1 + s2));
    }

    public static void main(String[] args) {
        AdditionOfTwoNumbersWithoutReturnWithParameters addObj = new AdditionOfTwoNumbersWithoutReturnWithParameters();

        addObj.addInt(20, 30);
        addObj.addLong(150L, 250L);
        addObj.addFloat(10.5f, 20.5f);
        addObj.addDouble(55.5d, 44.5d);
        addObj.addShort((short)12, (short)8);
    }
}
