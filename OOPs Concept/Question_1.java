class StringManipulator {

    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public String concatenate(String str, int num) {
        return str + num;
    }

    public String concatenate(int num, String str) {
        return num + str;
    }
}

public class Question_1 {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();

        System.out.println("Concatenate two strings: " + manipulator.concatenate("Hello", " World"));
        System.out.println("Concatenate string and integer: " + manipulator.concatenate("Age: ", 25));
        System.out.println("Concatenate integer and string: " + manipulator.concatenate(100, " dollars"));
    }
}
