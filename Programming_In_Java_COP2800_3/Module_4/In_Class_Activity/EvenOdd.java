package Programming_In_Java_COP2800_3.Module_4.In_Class_Activity;// Class to contain the main method and the even-odd checking logic

import java.util.Scanner;

public class EvenOdd {
    // Main method where the program execute starts
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        // Call the isEven() method to check if the number is even
        boolean isEvenNumber = isEven(number);
        // Display whether the number is even or odd based on the boolean value returned by isEven()
        if (isEvenNumber) {
            System.out.println(number + " is Even.");
        }
        else {
            System.out.println(number + " is Odd.");
        }
        // Close the scanner object to avoid resources leakage
        input.close();
    }
    public static boolean isEven(int number) {
        // An even number is divisible by 2 (remainder is 0), so we return true if the num % 2 == 0
        return number % 2 ==0;
    }
}
