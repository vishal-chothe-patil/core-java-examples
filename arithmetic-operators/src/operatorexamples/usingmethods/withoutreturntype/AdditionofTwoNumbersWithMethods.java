package operatorexamples.usingmethods.withoutreturntype;

public class AdditionofTwoNumbersWithMethods {

    // Method to add two integers and print the result
    public void addInt() {
        int val1 = 10, val2 = 25;
        int sum = val1 + val2;
        System.out.println("Addition of Two Number is " + val1 + " + " + val2 + " = " + sum);
    }

    // Method to add two long values and print the result
    public void addlong() {
        long a = 102L, b = 203L;
        // long c = a + b;
        System.out.println("Addition of Two Number is " + a + " + " + b + " = " + (a + b));
    }

    // Method to add two float values and print the result
    public void addfloat() {
        float e = 12.5f, f = 23.3f;
        // float g = e + f;
        System.out.println("Addition of Two Number is " + e + " + " + f + " = " + (e + f));
    }

    // Method to add two double values and print the result
    public void adddouble() {
        double j = 123.5d, k = 234.3d;
        // double l = j + k;
        System.out.println("Addition of Two Number is " + j + " + " + k + " = " + (j + k));
    }

    // Method to add two short values and print the result
    // Note: When two shorts are added, result is promoted to int in Java
    public void addshort() {
        short m = 6, n = 7;
        // int o = m + n;  // Result of short addition is automatically promoted to int
        System.out.println("Addition of Two Number is " + m + " + " + n + " = " + (m + n));
    }

    public static void main(String[] args) {
        AdditionofTwoNumbersWithMethods addObj = new AdditionofTwoNumbersWithMethods();

        // Call methods to perform and display addition results for each type
        addObj.addInt();
        addObj.addlong();
        addObj.addfloat();
        addObj.adddouble();
        addObj.addshort();
    }
}
