// File: Employee.java
import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    // Constructor
    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Method to calculate years of service
    public int getYearsOfService() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(hireDate, currentDate);
        return period.getYears();
    }

    // Display employee info
    public void displayEmployeeInfo() {
        System.out.println("Name: - Employee.java:26" + name);
        System.out.println("Salary: - Employee.java:27" + salary);
        System.out.println("Hire Date: - Employee.java:28" + hireDate);
        System.out.println("Years of Service: - Employee.java:29" + getYearsOfService());
    }

    // Main method to test Employee class
    public static void main(String[] args) {
        // Create Employee objects
        Employee e1 = new Employee("Alice Johnson", 50000, LocalDate.of(2018, 6, 15));
        Employee e2 = new Employee("Bob Smith", 60000, LocalDate.of(2012, 3, 20));

        // Display employee info
        System.out.println("=== Employee 1 === - Employee.java:39");
        e1.displayEmployeeInfo();

        System.out.println("\n=== Employee 2 === - Employee.java:42");
        e2.displayEmployeeInfo();
    }
}
