abstract class Person {
    abstract String getFullName();
    abstract void displayInfo();
}

class Employee extends Person {
    private String firstName;
    private String lastName;
    private int employeeId;

    public Employee(String firstName, String lastName, int employeeId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Full Name: " + getFullName());
    }
}

public class Question_3 {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Doe", 12345);
        employee.displayInfo();
    }
}
