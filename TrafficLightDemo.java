// File: TrafficLightDemo.java

class TrafficLight {
    private String color;
    private int duration; // in seconds

    // Constructor
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // Method to change color and duration
    public void changeColor(String newColor, int newDuration) {
        this.color = newColor;
        this.duration = newDuration;
        System.out.println("Traffic light changed to - TrafficLightDemo.java:17" + color + " for " + duration + " seconds.");
    }

    // Check if light is red
    public boolean isRed() {
        return color.equalsIgnoreCase("Red");
    }

    // Check if light is green
    public boolean isGreen() {
        return color.equalsIgnoreCase("Green");
    }

    // Display traffic light info
    public void displayLight() {
        System.out.println("Current Light: - TrafficLightDemo.java:32" + color + ", Duration: " + duration + " seconds.");
    }
}

public class TrafficLightDemo {
    public static void main(String[] args) {
        // Create a traffic light with initial state
        TrafficLight light = new TrafficLight("Red", 30);

        // Display initial state
        light.displayLight();

        // Check state
        System.out.println("Is Red? - TrafficLightDemo.java:45" + light.isRed());
        System.out.println("Is Green? - TrafficLightDemo.java:46" + light.isGreen());

        // Change to Green
        light.changeColor("Green", 45);
        light.displayLight();

        // Change to Yellow
        light.changeColor("Yellow", 5);
        light.displayLight();
    }
}

