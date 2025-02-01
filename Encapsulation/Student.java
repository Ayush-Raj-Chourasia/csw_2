public class Student {
    private String name;
    private int age;
    private double grade;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }

    public void setGrade(double grade) {
        if (grade >= 0.0 && grade <= 100.0) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade");
        }
    }

    public double getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John Doe");
        student.setAge(20);
        student.setGrade(85.5);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Grade: " + student.getGrade());

        student.setAge(-5); // Invalid age
        student.setGrade(105.0); // Invalid grade
    }
}