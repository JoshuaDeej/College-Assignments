package Programming_In_Java_COP2800_3.Module_7.In_Class_Activity;

public class CountSpaces {
    public static void main(String[] args) {
        // Define a String variable that holds your favorite inspirational quote
        String quote = "The only way to do great work is to love what you do.";

        // Count the number of spaces (' ') in the quote
        int spaceCount = 0;
        for (int i = 0; i < quote.length(); i++) {
            if (quote.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Display the total number of spaces
        System.out.println("The total number of spaces in the quote is: " + spaceCount);
    }
}
