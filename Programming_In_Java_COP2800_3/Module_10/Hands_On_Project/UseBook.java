package Programming_In_Java_COP2800_3.Module_10.Hands_On_Project;

import java.util.Scanner;

public class UseBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter title for Fiction book:");
        String fictionTitle = scanner.nextLine();
        BookInfo fictionBook = new Fiction(fictionTitle);

        System.out.println("Enter title for NonFiction book:");
        String nonFictionTitle = scanner.nextLine();
        BookInfo nonFictionBook = new NonFiction(nonFictionTitle);

        System.out.println("\nFiction Book:");
        System.out.println("Title: " + fictionBook.getTitle());
        System.out.println("Price: $" + fictionBook.getPrice());

        System.out.println("\nNonFiction Book:");
        System.out.println("Title: " + nonFictionBook.getTitle());
        System.out.println("Price: $" + nonFictionBook.getPrice());
    }
}
