class Person {
    String firstName;
    String lastName;
    int age;

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

class Student extends Person {
    String studentID;

    Student(String firstName, String lastName, int age, String studentID) {
        super(firstName, lastName, age);
        this.studentID = studentID;
    }

    public void study() {
        System.out.println(getFullName() + " is studying.");
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age);
        this.subject = subject;
    }

    public void teach() {
        System.out.println(getFullName() + " is teaching " + subject + ".");
    }
}

public class Question_3 {
    public static void main(String[] args) {
        Student student = new Student("John", "Doe", 20, "S12345");
        Teacher teacher = new Teacher("Jane", "Smith", 35, "Mathematics");

        System.out.println(student.getFullName());
        student.study();

        System.out.println(teacher.getFullName());
        teacher.teach();
    }
}
