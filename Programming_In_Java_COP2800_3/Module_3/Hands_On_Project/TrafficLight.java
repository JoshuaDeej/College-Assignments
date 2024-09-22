package Programming_In_Java_COP2800_3.Module_3.Hands_On_Project;

public class TrafficLight {
    private String color;
    private int duration;

    // Constructor to initialize the traffic light with a color and duration
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // Method to change the color of the traffic light
    public void changeColor(String newColor) {
        this.color = newColor;
    }

    // Method to check if the traffic light is red
    public boolean isRed() {
        return "red".equalsIgnoreCase(this.color);
    }

    // Method to check if the traffic light is green
    public boolean isGreen() {
        return "green".equalsIgnoreCase(this.color);
    }

    // Method to get the current color of the traffic light
    public String getColor() {
        return this.color;
    }

    // Method to get the duration of the traffic light
    public int getDuration() {
        return this.duration;
    }

    // Method to set a new duration for the traffic light
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static void main(String[] args) {
        // Create a new TrafficLight object with initial color "red" and duration 30 seconds
        TrafficLight light = new TrafficLight("red", 30);

        // Print the current color and duration of the traffic light
        System.out.println("Current color: " + light.getColor());
        System.out.println("Current duration: " + light.getDuration() + " seconds");

        // Check if the light is red or green
        System.out.println("Is the light red? " + light.isRed());
        System.out.println("Is the light green? " + light.isGreen());

        // Change the color to green and update the duration
        light.changeColor("green");
        light.setDuration(45);

        // Print the updated color and duration of the traffic light
        System.out.println("Updated color: " + light.getColor());
        System.out.println("Updated duration: " + light.getDuration() + " seconds");

        // Check again if the light is red or green
        System.out.println("Is the light red? " + light.isRed());
        System.out.println("Is the light green? " + light.isGreen());
    }
}
