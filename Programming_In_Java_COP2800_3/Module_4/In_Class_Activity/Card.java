package Programming_In_Java_COP2800_3.Module_4.In_Class_Activity;

public class Card {
    private char suit; // 's' for spades, 'h' for hearts, 'd' for diamonds, 'c' for clubs
    private int value; // 1 to 13

    // Constructor
    public Card(char suit, int value) {
        this.suit = suit;
        setValue(value); // Use the setValue method to ensure the value is within range
    }

    // Getter for suit
    public char getSuit() {
        return suit;
    }

    // Setter for suit
    public void setSuit(char suit) {
        this.suit = suit;
    }

    // Getter for value
    public int getValue() {
        return value;
    }

    // Setter for value with validation
    public void setValue(int value) {
        if (value < 1 || value > 13) {
            this.value = 1; // Assign 1 if the value is out of range
        } else {
            this.value = value;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Card card = new Card('h', 5);
        System.out.println("Suit: " + card.getSuit() + ", Value: " + card.getValue());

        card.setValue(15); // Out of range, should set to 1
        System.out.println("Suit: " + card.getSuit() + ", Value: " + card.getValue());
    }
}
