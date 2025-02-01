abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class Question_4 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Red", 5);
        shapes[1] = new Rectangle("Blue", 4, 6);
        shapes[2] = new Circle("Green", 7);
        shapes[3] = new Rectangle("Yellow", 3, 8);

        for (Shape shape : shapes) {
            System.out.println("Shape color: " + shape.color + ", Area: " + shape.calculateArea());
        }
    }
}
