package Programming_In_Java_COP2800_3.Module_7.In_Class_Activity;

import java.util.Scanner;

public class CountSpaces2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a quote:");
        String quote = scanner.nextLine();
        int spaceCount = 0;

        for (char c : quote.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }

        System.out.println("Total number of spaces: " + spaceCount);
    }
}
