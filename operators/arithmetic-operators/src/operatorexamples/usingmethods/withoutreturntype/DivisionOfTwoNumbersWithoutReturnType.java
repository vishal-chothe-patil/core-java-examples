package operatorexamples.usingmethods.withoutreturntype;

public class DivisionOfTwoNumbersWithoutReturnType {

    public void divInt() {
        int val1 = 20, val2 = 4;
        int result = val1 / val2;
        System.out.println("Division of Two Integers: " + val1 + " / " + val2 + " = " + result);
    }

    public void divLong() {
        long a = 120L, b = 10L;
        System.out.println("Division of Two Longs: " + a + " / " + b + " = " + (a / b));
    }

    public void divFloat() {
        float x = 15.5f, y = 2.0f;
        System.out.println("Division of Two Floats: " + x + " / " + y + " = " + (x / y));
    }

    public void divDouble() {
        double p = 22.0d, q = 7.0d;
        System.out.println("Division of Two Doubles: " + p + " / " + q + " = " + (p / q));
    }

    public void divShort() {
        short m = 18, n = 3;
        System.out.println("Division of Two Shorts: " + m + " / " + n + " = " + (m / n));
    }

    public static void main(String[] args) {
        DivisionOfTwoNumbersWithoutReturnType divObj = new DivisionOfTwoNumbersWithoutReturnType();
        divObj.divInt();
        divObj.divLong();
        divObj.divFloat();
        divObj.divDouble();
        divObj.divShort();
    }
}
