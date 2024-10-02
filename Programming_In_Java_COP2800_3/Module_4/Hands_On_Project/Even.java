package Programming_In_Java_COP2800_3.Module_4.Hands_On_Project;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter an even number or 999 to stop: ");
            number = scanner.nextInt();

            if (number == 999) {
                System.out.println("Program terminated.");
                break;
            } else if (number % 2 == 0) {
                System.out.println("Good job!");
            } else {
                System.out.println("Error: Please enter an even number.");
            }
        }

        scanner.close();
    }
}
