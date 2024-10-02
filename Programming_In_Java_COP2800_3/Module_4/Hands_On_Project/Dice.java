package Programming_In_Java_COP2800_3.Module_4.Hands_On_Project;

import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Dice Game!");
        System.out.print("Choose a number between 2 and 12: ");
        int userChoice = scanner.nextInt();

        if (userChoice < 2 || userChoice > 12) {
            System.out.println("Invalid choice. Please choose a number between 2 and 12.");
            return;
        }

        boolean userWins = false;
        for (int i = 0; i < 3; i++) {
            Die die1 = new Die();
            Die die2 = new Die();
            int rollTotal = die1.getValue() + die2.getValue();
            System.out.println("Roll " + (i + 1) + ": You rolled a " + rollTotal);

            if (rollTotal == userChoice) {
                userWins = true;
                break;
            }
        }

        if (userWins) {
            System.out.println("Congratulations! You win!");
        } else {
            System.out.println("Sorry, you didn't roll your number. The computer wins.");
        }

        scanner.close();
    }
}
