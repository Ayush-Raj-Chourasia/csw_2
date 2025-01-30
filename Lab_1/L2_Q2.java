
class a{
    static int x;
    void show(){
        System.out.println(x);
    }
}


class b extends a{
    void show(){
        System.out.println("hello");
        super.show();
    }
}

class c extends b{
    void show(){
        System.out.println("world");
    }
}
public class L2_Q2 {

    public static void main(String[] args) {
        a arr[] = new a[2];
        arr[0] = new b();
        arr[1] = new c()                                            ;
        arr[0].show();
        arr[1].show();

    }
    
}
