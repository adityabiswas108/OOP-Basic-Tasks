// File: EmployeeDemo.java

class Employee {
    // Attributes
    private String name;
    private String jobTitle;
    private double salary;

    // Constructor
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for jobTitle
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // Getter and Setter for salary
    public double getSalary() {
        return salary;
    }

    // Method to update salary (increase by percentage)
    public void updateSalary(double percentage) {
        salary += salary * (percentage / 100);
    }

    // Display employee details
    public void displayEmployeeInfo() {
        System.out.println("Name: - EmployeeDemo.java:46" + name);
        System.out.println("Job Title: - EmployeeDemo.java:47" + jobTitle);
        System.out.println("Salary: - EmployeeDemo.java:48" + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        // Create Employee object
        Employee emp = new Employee("Alice Johnson", "Software Engineer", 50000);

        // Display details
        System.out.println("=== Employee Details === - EmployeeDemo.java:58");
        emp.displayEmployeeInfo();

        // Update salary by 10%
        System.out.println("\nUpdating salary by 10%... - EmployeeDemo.java:62");
        emp.updateSalary(10);

        // Display updated details
        System.out.println("\n=== Updated Employee Details === - EmployeeDemo.java:66");
        emp.displayEmployeeInfo();
    }
}
