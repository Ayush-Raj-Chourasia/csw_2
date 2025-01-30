
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

    public double area(double radius) {
        return Math.PI * radius * radius;
    }
}

public class L1_Q1 {
    public static void main(String[] args) {
        Circle ob = new Circle();
        ob.set(10);
        double r = ob.get();
        System.out.println("Radius of circle: " + r);
        System.out.println("Area of circle: " + ob.area(r));
    }
}
