package Lab_1;

class Circle {
    private double radius;

    public double get() {
        return this.radius;
    }

    public void set(double radius) {
        if (radius >= 0.0) {
            this.radius = radius;
        } else {
            System.out.println("Error: Radius cannot be negative.");
        }
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

public class L1_Q1 {
    public static void main(String[] args) {
        Circle ob = new Circle();
        ob.set(10);
        System.out.println("Radius of circle: " + ob.get());
        System.out.println("Area of circle: " + ob.area());
    }
}
