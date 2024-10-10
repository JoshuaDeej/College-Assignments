package Programming_In_Java_COP2800_3.Module_5.Hands_On_Project;

import java.util.Scanner;

public class SalespersonSort {
    private static class Salesperson {
        private int id;
        private double sales;

        public Salesperson(int id, double sales) {
            this.id = id;
            this.sales = sales;
        }

        public int getId() {
            return id;
        }

        public double getSales() {
            return sales;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Sales: " + sales;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Salesperson[] salespeople = new Salesperson[7];

        for (int i = 0; i < salespeople.length; i++) {
            System.out.print("Enter ID for salesperson " + (i + 1) + ": ");
            int id = scanner.nextInt();
            System.out.print("Enter sales value for salesperson " + (i + 1) + ": ");
            double sales = scanner.nextDouble();
            salespeople[i] = new Salesperson(id, sales);
        }

        System.out.print("Sort by (I)D number or (S)ales value? ");
        char choice = scanner.next().toUpperCase().charAt(0);

        if (choice == 'I') {
            sortById(salespeople);
        } else if (choice == 'S') {
            sortBySales(salespeople);
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        System.out.println("Sorted Salesperson List:");
        for (Salesperson salesperson : salespeople) {
            System.out.println(salesperson);
        }

        scanner.close();
    }

    private static void sortById(Salesperson[] salespeople) {
        for (int i = 0; i < salespeople.length - 1; i++) {
            for (int j = 0; j < salespeople.length - 1 - i; j++) {
                if (salespeople[j].getId() > salespeople[j + 1].getId()) {
                    Salesperson temp = salespeople[j];
                    salespeople[j] = salespeople[j + 1];
                    salespeople[j + 1] = temp;
                }
            }
        }
    }

    private static void sortBySales(Salesperson[] salespeople) {
        for (int i = 0; i < salespeople.length - 1; i++) {
            for (int j = 0; j < salespeople.length - 1 - i; j++) {
                if (salespeople[j].getSales() > salespeople[j + 1].getSales()) {
                    Salesperson temp = salespeople[j];
                    salespeople[j] = salespeople[j + 1];
                    salespeople[j + 1] = temp;
                }
            }
        }
    }
}
