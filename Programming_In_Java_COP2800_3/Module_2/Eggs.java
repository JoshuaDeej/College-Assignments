package Programming_In_Java_COP2800_3.Module_2;

import java.util.Scanner;
public class Eggs {
    public static void main(String[] args) {
        // Constants for the prices
        final double DOZEN_PRICE = 3.25;
        final double INDIVIDUAL_EGG_PRICE = 0.45;
        final int DOZEN_COUNT = 12;

        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of eggs
        System.out.print("Enter the number of eggs in your order: ");

        int eggCount = input.nextInt();

        // Calculate the number of dozens and leftover eggs
        int dozens = eggCount / DOZEN_COUNT;
        int looseEggs = eggCount % DOZEN_COUNT;

        // Calculate the total cost
        double totalCost = (dozens * DOZEN_PRICE) + (looseEggs * INDIVIDUAL_EGG_PRICE);

        // Output the full explanation of the order and total price
        System.out.printf("You ordered %d eggs.%n", eggCount);
        System.out.printf("That's %d loose eggs at $%.2f per dozen ", dozens, DOZEN_PRICE);
        System.out.printf("and %d loose eggs at %.2f cents each.%n", looseEggs, INDIVIDUAL_EGG_PRICE);
        System.out.printf(" For a Total of $%.2f.%n ", totalCost);

        // Close the scanner
        input.close();
    }
}
