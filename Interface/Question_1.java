interface Movable {
    void move();
}

interface Resizable {
    void resize();
}

class Shape implements Movable, Resizable {

    public void move() {
        System.out.println("Shape is moved.");
    }

    public void resize() {
        System.out.println("Shape is resized.");
    }
}

public class Question_1 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        
        shape.move();
        shape.resize();
    }
}
