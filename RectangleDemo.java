// Rectangle class with width and height attributes
class Rectangle {
    private double width;
    private double height;

    // Constructor to initialize width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area
    public double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Getters (optional, for demonstration)
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

// Main class to test Rectangle
public class RectangleDemo {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rect = new Rectangle(5.0, 3.0);

        // Display width and height
        System.out.println("Rectangle Width: - RectangleDemo.java:39" + rect.getWidth());
        System.out.println("Rectangle Height: - RectangleDemo.java:40" + rect.getHeight());

        // Calculate and display area and perimeter
        System.out.println("Area: - RectangleDemo.java:43" + rect.getArea());
        System.out.println("Perimeter: - RectangleDemo.java:44" + rect.getPerimeter());
    }
}
