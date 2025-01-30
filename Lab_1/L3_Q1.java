class Complex{
    int real;
    int img;

    Complex(int real , int img){
        this.real = real;
        this.img = img;
    }
    public Complex add(Complex c1, Complex c2){
       
        int a = c1.real + c2.real;
        int b = c1.img + c2.img;
        Complex c3 = new Complex(a,b);
        return c3;
    }

    public Complex diff(Complex c1, Complex c2){
        int a = c1.real - c2.real;
        int b = c1.img - c2.img;
        Complex c4 = new Complex(a,b);
        return c4;
    }
}

public class L3_Q1{
    public static void main(String[] args) {
        Complex c1 = new Complex(15,3);
        Complex c2 = new Complex(5,10);
        Complex c3 = new Complex(0, 0);
        Complex sum = c3.add(c1, c2);
        Complex diff = c3.diff(c1,c2);
        System.out.println("Addition: "+sum.real+ " + "+sum.img+"i");
        System.out.println("Difference: "+diff.real+ " + "+diff.img+"i");

    }
}