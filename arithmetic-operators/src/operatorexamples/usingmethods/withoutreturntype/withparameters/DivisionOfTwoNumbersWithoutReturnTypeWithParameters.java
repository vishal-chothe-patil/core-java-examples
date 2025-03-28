package operatorexamples.usingmethods.withoutreturntype.withparameters;

public class DivisionOfTwoNumbersWithoutReturnTypeWithParameters {

    public void divInt(int a, int b) {
        System.out.println("Division of two int numbers: " + a + " / " + b + " = " + (a / b));
    }

    public void divLong(long x, long y) {
        System.out.println("Division of two long numbers: " + x + " / " + y + " = " + (x / y));
    }

    public void divFloat(float m, float n) {
        System.out.println("Division of two float numbers: " + m + " / " + n + " = " + (m / n));
    }

    public void divDouble(double p, double q) {
        System.out.println("Division of two double numbers: " + p + " / " + q + " = " + (p / q));
    }

    public void divShort(short s1, short s2) {
        System.out.println("Division of two short numbers: " + s1 + " / " + s2 + " = " + (s1 / s2));
    }

    public static void main(String[] args) {
        DivisionOfTwoNumbersWithoutReturnTypeWithParameters divObj = new DivisionOfTwoNumbersWithoutReturnTypeWithParameters();

        divObj.divInt(100, 25);
        divObj.divLong(500L, 10L);
        divObj.divFloat(55.5f, 5.0f);
        divObj.divDouble(99.9d, 3.3d);
        divObj.divShort((short)40, (short)8);
    }
}
