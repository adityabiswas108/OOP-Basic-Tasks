// Person class with name and age attributes
class Person {
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Main class to demonstrate usage
public class PersonDemo {
    public static void main(String[] args) {
        // Creating two Person objects using the constructor
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        // Printing their name and age
        System.out.println("Person 1: Name = - PersonDemo.java:30" + person1.getName() + ", Age = " + person1.getAge());
        System.out.println("Person 2: Name = - PersonDemo.java:31" + person2.getName() + ", Age = " + person2.getAge());
    }
}
