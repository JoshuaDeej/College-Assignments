package Programming_In_Java_COP2800_3.Module_6.In_Class_Activity;

import java.util.Scanner;

public class InventoryManagementSystem {

    public static void main(String[] args) {
        String[] productNames = {"Apples", "Oranges", "Bananas", "Grapes"};
        int[] productQuantities = {50, 30, 20, 15};

        // Display products and quantities
        System.out.println("Initial Inventory:");
        for (int i = 0; i < productNames.length; i++) {
            System.out.println(productNames[i] + ": " + productQuantities[i]);
        }

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Enter product name to update quantity (or type 'exit' to quit):");
            String productName = scanner.nextLine();

            if (productName.equalsIgnoreCase("exit")) {
                exit = true;
            } else {
                boolean validProduct = false;
                for (int i = 0; i < productNames.length; i++) {
                    if (productNames[i].equalsIgnoreCase(productName)) {
                        validProduct = true;
                        boolean validInput;
                        do {
                            System.out.println("Enter new quantity for " + productNames[i] + ":");
                            if (scanner.hasNextInt()) {
                                productQuantities[i] = scanner.nextInt();
                                validInput = true;
                            } else {
                                System.out.println("Invalid input. Please enter a numeric value.");
                                validInput = false;
                                scanner.next(); // clear invalid input
                            }
                        } while (!validInput);
                        scanner.nextLine(); // clear the buffer
                        break;
                    }
                }
                if (!validProduct) {
                    System.out.println("Product not found.");
                }
            }
        }

        System.out.println("Final Inventory:");
        for (int i = 0; i < productNames.length; i++) {
            System.out.println(productNames[i] + ": " + productQuantities[i]);
        }
    }
}
