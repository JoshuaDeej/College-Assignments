package Programming_In_Java_COP2800_3.Module_2.In_Class_Activity;

public class Circle {
    // Attribute for radius
    private double radius;

    // Constructor to initialize the circle with a given radius
    public Circle(double radius) {
        this.radius = radius;
    }
    // Method to set the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    // Method to get the radius
    public double getRadius() {
        return radius;
    }
    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    // Main method to test the Programming_In_Java_COP2800_3.Module_2.In_Class_Activity.Circle class
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());

        // Modify the radius and display the updated values
        circle.setRadius(7.0);
        System.out.println("\nUpdated Radius: " + circle.getRadius());
        System.out.println("\nUpdated Area: " + circle.calculateArea());
        System.out.println("\nUpdated Circumference: " + circle.calculateCircumference());
    }
}
