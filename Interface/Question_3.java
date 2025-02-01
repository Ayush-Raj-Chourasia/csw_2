interface Constants {
    double PI = 3.14159;
    double SPEED_OF_LIGHT = 299792458; // in meters per second
}

class PhysicsConstants implements Constants {
    // No need to implement constants as they are already defined in the interface
}

public class Question_3 {
    public static void main(String[] args) {
        System.out.println("Value of PI: " + Constants.PI);
        System.out.println("Speed of Light: " + Constants.SPEED_OF_LIGHT + " meters per second");
    }
}
