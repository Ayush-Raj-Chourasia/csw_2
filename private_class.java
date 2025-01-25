class A {
    private int age;

    public int get() {
        return this.age;
    }

    public void set(int age) {
        this.age = age;
    }
}

public class private_class {
    public static void main(String[] args) {
        A ob = new A(); 
        ob.set(10);
        System.out.println(ob.get());
    }
}
