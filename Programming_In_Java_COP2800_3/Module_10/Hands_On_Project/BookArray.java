package Programming_In_Java_COP2800_3.Module_10.Hands_On_Project;

import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        BookInfo[] books = new BookInfo[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter title for book " + (i + 1) + ":");
            String title = scanner.nextLine();

            System.out.println("Is this book Fiction or NonFiction? (F/N):");
            String type = scanner.nextLine();

            if (type.equalsIgnoreCase("F")) {
                books[i] = new Fiction(title);
            } else if (type.equalsIgnoreCase("N")) {
                books[i] = new NonFiction(title);
            } else {
                System.out.println("Invalid type, please enter F for Fiction or N for NonFiction.");
                i--;  // Reprompt the user for the current book.
            }
        }

        System.out.println("\nBook Details:");
        for (BookInfo book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Price: $" + book.getPrice());
            System.out.println();
        }
    }
}
