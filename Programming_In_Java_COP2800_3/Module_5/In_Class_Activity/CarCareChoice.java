package Programming_In_Java_COP2800_3.Module_5.In_Class_Activity;

import java.util.Scanner;
public class CarCareChoice {
    public static void main(String[] args) {
        // Create a scanner object for user input.
        Scanner input = new Scanner(System.in);

        // List of available services and their corresponding prices.
        String[] services = {"oil change", "tire rotation", "battery check", "brake replacement"};
        int[] prices = {25, 22, 15, 5};
        // Display the available services.
        System.out.println("Welcome to Chapa's Car Care Shop");
        System.out.println("Available services");
        for (String service : services) {
            System.out.println(service);
        }
        // Prompt the user to enter a service.
        System.out.print("Please enter a service from the list: ");
        String userChoice = input.nextLine().toLowerCase();
        // Determine and display the price or show an error if the service is invalid.
        boolean validChoice = false;
        for (int i = 0; i < services.length; i++) {
            if (userChoice.equals(services[i])) {
                System.out.println("You have selected " + services[i] + "from the selection.");
                System.out.println("The price is: $" + prices[i]);
                validChoice = true;
                break;
            }
        }
        // If the service is not valid, display an error message.
        if (!validChoice) {
            System.out.println("Error: Invalid service entered. Please select a valid option.");
        }
    }
}
