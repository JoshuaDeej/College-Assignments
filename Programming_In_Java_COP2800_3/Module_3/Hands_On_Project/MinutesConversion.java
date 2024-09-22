package Programming_In_Java_COP2800_3.Module_3.Hands_On_Project;

import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of minutes
        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();

        // Convert minutes to hours and days
        double hours = minutes / 60.0;
        double days = minutes / 1440.0; // 1440 minutes in a day

        // Display the results
        System.out.println(minutes + " minutes is equal to " + hours + " hours.");
        System.out.println(minutes + " minutes is equal to " + days + " days.");

        scanner.close();
    }
}
