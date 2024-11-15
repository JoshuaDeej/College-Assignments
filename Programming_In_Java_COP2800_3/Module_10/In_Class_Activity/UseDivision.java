package Programming_In_Java_COP2800_3.Module_10.In_Class_Activity;

import java.util.Scanner;

public class UseDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Division division;

        System.out.println("Enter the type of division (Domestic/International): ");
        String type = scanner.nextLine();

        System.out.println("Enter the division name: ");
        String divisionName = scanner.nextLine();

        System.out.println("Enter the account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (type.equalsIgnoreCase("International")) {
            System.out.println("Enter the country: ");
            String country = scanner.nextLine();

            System.out.println("Enter the language: ");
            String language = scanner.nextLine();

            division = new InternationalDivision(divisionName, accountNumber, country, language);
        } else {
            System.out.println("Enter the state: ");
            String state = scanner.nextLine();

            division = new DomesticDivision(divisionName, accountNumber, state);
        }

        division.display();
        scanner.close();
    }
}
