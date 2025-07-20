package operatorexamples.usingmethods.withoutreturntype;

public class SubtractionofTwoNumbersWithoutReturnType {

    public void subInt() {
        int val1 = 25, val2 = 10;
        int sub = val1 - val2;
        System.out.println("Subtraction of Two Numbers is " + val1 + " - " + val2 + " = " + sub);
    }

    public void subLong() {
        long a = 500L, b = 300L;
        System.out.println("Subtraction of Two Numbers is " + a + " - " + b + " = " + (a - b));
    }

    public void subFloat() {
        float e = 42.6f, f = 18.7f;
        System.out.println("Subtraction of Two Numbers is " + e + " - " + f + " = " + (e - f));
    }

    public void subDouble() {
        double j = 299.4d, k = 145.9d;
        System.out.println("Subtraction of Two Numbers is " + j + " - " + k + " = " + (j - k));
    }

    public void subShort() {
        short m = 20, n = 10;
        System.out.println("Subtraction of Two Numbers is " + m + " - " + n + " = " + (m - n));
    }

    public static void main(String[] args) {
        SubtractionofTwoNumbersWithoutReturnType subObj = new SubtractionofTwoNumbersWithoutReturnType();

        subObj.subInt();
        subObj.subLong();
        subObj.subFloat();
        subObj.subDouble();
        subObj.subShort();
    }
}
