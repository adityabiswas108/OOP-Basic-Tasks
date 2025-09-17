// File: StudentDemo.java
import java.util.ArrayList;

class Student {
    private String name;
    private String grade;
    private ArrayList<String> courses;

    // Constructor
    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    // Add course
    public void addCourse(String course) {
        if (!courses.contains(course)) {
            courses.add(course);
            System.out.println(course + "added to - StudentDemo.java:20" + name + "'s courses.");
        } else {
            System.out.println(course + "is already enrolled. - StudentDemo.java:22");
        }
    }

    // Remove course
    public void removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println(course + "removed from - StudentDemo.java:30" + name + "'s courses.");
        } else {
            System.out.println(course + "not found in course list. - StudentDemo.java:32");
        }
    }

    // Display student info
    public void displayStudentInfo() {
        System.out.println("\n=== Student Information === - StudentDemo.java:38");
        System.out.println("Name: - StudentDemo.java:39" + name);
        System.out.println("Grade: - StudentDemo.java:40" + grade);
        System.out.println("Courses: - StudentDemo.java:41" + (courses.isEmpty() ? "No courses enrolled" : courses));
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Create a student
        Student s1 = new Student("Alice Johnson", "10th Grade");

        // Add courses
        s1.addCourse("Mathematics");
        s1.addCourse("Science");
        s1.addCourse("English");

        // Display info
        s1.displayStudentInfo();

        // Try removing a course
        s1.removeCourse("Science");
        s1.displayStudentInfo();

        // Try removing a non-existing course
        s1.removeCourse("History");
    }
}
