package Programming_In_Java_COP2800_3.Module_7.Hands_On_Project;

import java.util.Scanner;

public class ThreeLetterAcronym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three words:");
        String input = scanner.nextLine();
        scanner.close();

        String[] words = input.split(" ");

        if (words.length < 3) {
            System.out.println("Please enter at least three words.");
            return;
        }

        String acronym = (words[0].substring(0, 1) +
                words[1].substring(0, 1) +
                words[2].substring(0, 1)).toUpperCase();

        System.out.println("Three-letter acronym: " + acronym);
    }
}
