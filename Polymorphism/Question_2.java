class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
    }

    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0.0;
        }
    }
}

public class Question_2 {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        System.out.println("Addition (int): " + mathOps.add(10, 5));
        System.out.println("Addition (double): " + mathOps.add(10.5, 5.5));

        System.out.println("Subtraction (int): " + mathOps.subtract(10, 5));
        System.out.println("Subtraction (double): " + mathOps.subtract(10.5, 5.5));

        System.out.println("Multiplication (int): " + mathOps.multiply(10, 5));
        System.out.println("Multiplication (double): " + mathOps.multiply(10.5, 5.5));

        System.out.println("Division (int): " + mathOps.divide(10, 5));
        System.out.println("Division (double): " + mathOps.divide(10.5, 5.5));
    }
}
