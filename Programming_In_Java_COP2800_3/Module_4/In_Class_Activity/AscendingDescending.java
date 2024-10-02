package Programming_In_Java_COP2800_3.Module_4.In_Class_Activity;

import java.util.Scanner;

public class AscendingDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter three integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Sort the numbers in ascending order
        int temp;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Display the numbers in ascending order
        System.out.println("Ascending order: " + num1 + ", " + num2 + ", " + num3);

        // Display the numbers in descending order
        System.out.println("Descending order: " + num3 + ", " + num2 + ", " + num1);
    }
}
