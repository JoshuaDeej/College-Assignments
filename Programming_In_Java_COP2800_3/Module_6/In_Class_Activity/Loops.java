package Programming_In_Java_COP2800_3.Module_6.In_Class_Activity;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // For loop to find the sum of all even numbers
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("Sum of even numbers: " + sum);

        Scanner scanner = new Scanner(System.in);
        int userInput;

        // Main loop to prompt user for input until 0 is entered
        do {
            // While loop to search for a specific number
            System.out.print("Enter a number to search for: ");
            int searchNumber = scanner.nextInt();
            int index = 0;
            boolean found = false;
            while (index < numbers.length) {
                if (numbers[index] == searchNumber) {
                    System.out.println("Number found at index: " + index);
                    found = true;
                    break;
                }
                index++;
            }
            if (!found) {
                System.out.println("Number not found in the array.");
            }

            // Prompting for next input
            System.out.print("Enter a number (0 to exit): ");
            userInput = scanner.nextInt();

        } while (userInput != 0);

        scanner.close();
    }
}
