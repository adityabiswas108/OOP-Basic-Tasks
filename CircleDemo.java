// File: CircleDemo.java

class Circle {
    // Attribute
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        // Create Circle object with radius 5
        Circle c = new Circle(5.0);

        // Display radius, area, and circumference
        System.out.println("Radius: - CircleDemo.java:39" + c.getRadius());
        System.out.println("Area: - CircleDemo.java:40" + c.getArea());
        System.out.println("Circumference: - CircleDemo.java:41" + c.getCircumference());

        // Modify radius
        c.setRadius(7.5);
        System.out.println("\nAfter changing radius: - CircleDemo.java:45");
        System.out.println("Radius: - CircleDemo.java:46" + c.getRadius());
        System.out.println("Area: - CircleDemo.java:47" + c.getArea());
        System.out.println("Circumference: - CircleDemo.java:48" + c.getCircumference());
    }
}
