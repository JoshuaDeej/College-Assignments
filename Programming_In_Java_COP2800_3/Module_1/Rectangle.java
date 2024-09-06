//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Rectangle {
    // Attributes
    private double width;
    private double height;
    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    // Method to calculate area
    public double calculateArea() {
        return width * height;
    }
    // Method to calculate the perimeter
    public double calculatePerimeter() {
        return 2 * (width * height);
    }
    // Main method to test the Rectangle class
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle myrectangle = new Rectangle(5.0, 7.0);

        // Print the area and perimeter
        System.out.println("Area of the rectangle : " + myrectangle.calculateArea());
        System.out.println("Perimeter of the rectangle : " + myrectangle.calculatePerimeter());
    }
}