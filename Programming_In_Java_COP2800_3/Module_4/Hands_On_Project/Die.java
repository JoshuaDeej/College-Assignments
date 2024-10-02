package Programming_In_Java_COP2800_3.Module_4.Hands_On_Project;

import java.util.Random;

public class Die {
    private int value;

    // Constructor that sets the value to a random number between 1 and 6
    public Die() {
        Random rand = new Random();
        this.value = rand.nextInt(6) + 1; // Generates a number between 1 and 6
    }

    // Method to return the value
    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        Die die = new Die();
        System.out.println("The value of the die is: " + die.getValue());
    }
}
