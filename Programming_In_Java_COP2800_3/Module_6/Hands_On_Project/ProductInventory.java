package Programming_In_Java_COP2800_3.Module_6.Hands_On_Project;

public class ProductInventory {
    public static void main(String[] args) {
        // Initialize Product Data
        String[] products = {"Laptop", "Smartphone", "Tablet", "Headphones", "Smartwatch"};
        int[] quantities = {10, 15, 5, 20, 12};

        // Display Product Inventory
        System.out.println("Product Inventory:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " - Quantity: " + quantities[i]);
        }

        // Update Product Quantities
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            System.out.print("Enter product number to update (1-5) or 0 to exit: ");
            int productNumber = scanner.nextInt();
            if (productNumber == 0) {
                break;
            }
            System.out.print("Enter new quantity for " + products[productNumber - 1] + ": ");
            int newQuantity;
            do {
                newQuantity = scanner.nextInt();
                if (newQuantity <= 0) {
                    System.out.print("Quantity must be a positive integer. Try again: ");
                }
            } while (newQuantity <= 0);
            quantities[productNumber - 1] = newQuantity;
            System.out.println("Updated " + products[productNumber - 1] + " quantity to " + newQuantity);
        }

        // Reordering Products Below Threshold
        System.out.println("The following products need to be reordered:");
        for (int quantity : quantities) {
            if (quantity < 5) {
                System.out.println(products[java.util.Arrays.asList(quantities).indexOf(quantity)] + ": " + quantity + " units left");
            }
        }

        // Nested Loop for Product Categories
        String[][] categories = {
                {"Electronics", "Laptop", "Smartphone", "Tablet"},
                {"Accessories", "Headphones", "Smartwatch"}
        };

        outerLoop:
        for (int i = 0; i < categories.length; i++) {
            System.out.println("Category: " + categories[i][0]);
            for (int j = 1; j < categories[i].length; j++) {
                System.out.println("- " + categories[i][j] + ": " + quantities[java.util.Arrays.asList(products).indexOf(categories[i][j])] + " units");
            }
            System.out.print("Press 0 to exit this category or any other key to continue: ");
            String input = scanner.next();
            if (input.equals("0")) {
                continue outerLoop;
            }
        }
    }
}
