package operatorexamples.usingmethods.withreturntype;

public class AdditionOfTwoNumbersWithReturnType {

    // Method to add two integers and return the result
    public int addInt() {
        int x = 15, y = 35;
        int sum = x + y;
        return sum;
    }

    // Method to add two long values and return the result
    public long addLong() {
        long a = 500L, b = 300L;
        return a + b;
    }

    // Method to add two float values and return the result
    public float addFloat() {
        float e = 18.7f, f = 42.6f;
        return e + f;
    }

    // Method to add two double values and return the result
    public double addDouble() {
        double j = 145.9d, k = 299.4d;
        return j + k;
    }

    // Method to add two short values and return the result as int
    public int addShort() {
        short m = 10, n = 20;
        return m + n;
    }

    public static void main(String[] args) {
        AdditionOfTwoNumbersWithReturnType addObj = new AdditionOfTwoNumbersWithReturnType();

        // Store and print the returned values
        int intResult = addObj.addInt();
        System.out.println("Addition of Two Integers = " + intResult);

        long longResult = addObj.addLong();
        System.out.println("Addition of Two Longs = " + longResult);

        float floatResult = addObj.addFloat();
        System.out.println("Addition of Two Floats = " + floatResult);

        double doubleResult = addObj.addDouble();
        System.out.println("Addition of Two Doubles = " + doubleResult);

        int shortResult = addObj.addShort(); // (since Java promotes short to int)
        System.out.println("Addition of Two Shorts = " + shortResult);
    }
}
