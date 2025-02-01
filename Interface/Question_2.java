interface MathOperations {
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }
}

class Calculator implements MathOperations {
    // No need to implement the static methods as they belong to the interface itself
}

public class Question_2 {
    public static void main(String[] args) {
        int sum = MathOperations.add(10, 5);
        int difference = MathOperations.subtract(10, 5);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
