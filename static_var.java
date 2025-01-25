class A {
    static int age;  
    String name;
    
    A(String name) {
        this.name = name;
    }
}

public class static_var {
    public static void main(String[] args) {
        A ob1 = new A("abc");
        A ob2 = new A("xyz");
        
        ob1.age = 10;  
        System.out.println(ob2.age);  
        
        ob2.age = A.age + 10; 
        System.out.println(ob1.age); 
        System.out.println(ob2.age); 
    }
}
