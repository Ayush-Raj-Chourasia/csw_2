class vehicle{
    int speed,mfdate;
    String name;

    // vehicle(){
    //     speed=100;
    //     mfdate=1996;
    //     name="";
    // }

    public vehicle(int speed, int mfdate, String name) {
        this.speed = speed;
        this.mfdate = mfdate;
        this.name = name;
    }
}

class bike extends vehicle{
    int noOfGears;
    boolean ABS;
    bike(){
        super(100,1996,"Bike"); 
        noOfGears=4;
        ABS = false;
        
    }

    
    bike(int noOfGears, boolean ABS) {
        super(100, 1996, "Bike");
        this.noOfGears = noOfGears;
        this.ABS = ABS;
    }
}

public class L2_Q1 {
    public static void main(String[] args) {
        bike b = new bike(5,  true);
        
        
        System.out.println("Name: " + b.name);
        System.out.println("Speed: " + b.speed);
        System.out.println("Manufacturing Date: " + b.mfdate);
        System.out.println("Number of Gears: " + b.noOfGears);
        System.out.println("ABS: " + b.ABS);
    }
}
