class Animal {
    public void makeSound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Question_1 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();

        Animal myCat = new Cat();
        myCat.makeSound();
    }
}
