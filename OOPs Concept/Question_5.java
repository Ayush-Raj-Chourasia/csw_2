class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void displayInfo() {
        System.out.println("Person: " + firstName + " " + lastName);
    }
}

class Student extends Person {
    String studentID;

    Student(String firstName, String lastName, String studentID) {
        super(firstName, lastName);
        this.studentID = studentID;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + firstName + " " + lastName + ", Student ID: " + studentID);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String firstName, String lastName, String subject) {
        super(firstName, lastName);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher: " + firstName + " " + lastName + ", Subject: " + subject);
    }
}

public class Question_5 {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Student("John", "Doe", "S12345");
        people[1] = new Teacher("Jane", "Smith", "Mathematics");
        people[2] = new Student("Alice", "Brown", "S67890");
        people[3] = new Teacher("Bob", "Johnson", "Physics");

        for (Person person : people) {
            person.displayInfo();
        }
    }
}
