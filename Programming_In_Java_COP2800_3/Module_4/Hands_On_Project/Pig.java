package Programming_In_Java_COP2800_3.Module_4.Hands_On_Project;

import java.util.Random;
import java.util.Scanner;

public class Pig {
    private static final int WINNING_SCORE = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userScore = 0, computerScore = 0;
        boolean userTurn = true;

        System.out.println("Welcome to the Pig Dice Game!");

        while (userScore < WINNING_SCORE && computerScore < WINNING_SCORE) {
            if (userTurn) {
                userScore = takeTurn(scanner, userScore, "User");
                userTurn = false;
            } else {
                computerScore = takeTurn(scanner, computerScore, "Computer");
                userTurn = true;
            }
        }

        if (userScore >= WINNING_SCORE) {
            System.out.println("Congratulations! You win!");
        } else {
            System.out.println("The computer wins. Better luck next time!");
        }

        scanner.close();
    }

    private static int takeTurn(Scanner scanner, int score, String player) {
        int turnTotal = 0;
        boolean continueRolling = true;

        while (continueRolling) {
            Die die1 = new Die();
            Die die2 = new Die();
            int roll1 = die1.getValue();
            int roll2 = die2.getValue();

            System.out.println(player + " rolled: " + roll1 + " and " + roll2);

            if (roll1 == 1 && roll2 == 1) {
                System.out.println(player + " rolled two 1s! Score reset to 0.");
                return 0;
            } else if (roll1 == 1 || roll2 == 1) {
                System.out.println(player + " rolled a 1. Turn over.");
                return score;
            } else {
                turnTotal += roll1 + roll2;
                System.out.println(player + "'s turn total: " + turnTotal);
                System.out.println(player + "'s overall score if turn ends: " + (score + turnTotal));

                if (player.equals("User")) {
                    System.out.print("Do you want to roll again? (y/n): ");
                    continueRolling = scanner.next().equalsIgnoreCase("y");
                } else {
                    continueRolling = new Random().nextDouble() >= 0.5;
                    System.out.println("Computer decides to " + (continueRolling ? "roll again." : "hold."));
                }
            }
        }

        return score + turnTotal;
    }
}
