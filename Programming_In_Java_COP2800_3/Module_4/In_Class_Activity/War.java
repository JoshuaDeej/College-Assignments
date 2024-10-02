package Programming_In_Java_COP2800_3.Module_4.In_Class_Activity;

import java.util.Random;

public class War {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        Random rand = new Random();

        // Deal card for player
        int playerValueIndex = rand.nextInt(values.length);
        int playerSuitIndex = rand.nextInt(suits.length);

        // Deal card for computer
        int computerValueIndex;
        int computerSuitIndex;

        do {
            computerValueIndex = rand.nextInt(values.length);
            computerSuitIndex = rand.nextInt(suits.length);
        } while (computerValueIndex == playerValueIndex && computerSuitIndex == playerSuitIndex);

        String playerCard = values[playerValueIndex] + " of " + suits[playerSuitIndex];
        String computerCard = values[computerValueIndex] + " of " + suits[computerSuitIndex];

        System.out.println("Player's card: " + playerCard);
        System.out.println("Computer's card: " + computerCard);

        if (playerValueIndex > computerValueIndex) {
            System.out.println("Player wins!");
        } else if (playerValueIndex < computerValueIndex) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
