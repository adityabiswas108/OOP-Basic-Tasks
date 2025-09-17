// Dog class with name and breed attributes
class Dog {
    private String name;
    private String breed;

    // Constructor to initialize name and breed
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }

    // Setter for breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Method to display dog info
    public void displayInfo() {
        System.out.println("Dog Name: - DogDemo.java:34" + name + ", Breed: " + breed);
    }
}

// Main class to demonstrate Dog class
public class DogDemo {
    public static void main(String[] args) {
        // Creating two Dog objects
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Lucy", "Beagle");

        // Display original values
        System.out.println("Original Dog Info: - DogDemo.java:46");
        dog1.displayInfo();
        dog2.displayInfo();

        // Modify the attributes using setters
        dog1.setName("Max");
        dog1.setBreed("Labrador");

        dog2.setName("Daisy");
        dog2.setBreed("Poodle");

        // Display updated values
        System.out.println("\nUpdated Dog Info: - DogDemo.java:58");
        dog1.displayInfo();
        dog2.displayInfo();
    }
}

