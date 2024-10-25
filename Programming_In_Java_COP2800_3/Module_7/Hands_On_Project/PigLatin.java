package Programming_In_Java_COP2800_3.Module_7.Hands_On_Project;

import java.util.Scanner;

public class PigLatin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String pigLatinWord = convertToPigLatin(word);
        System.out.println("Pig Latin: " + pigLatinWord);
    }

    public static String convertToPigLatin(String word) {
        String vowels = "aeiou";
        char firstLetter = word.charAt(0);

        if (vowels.indexOf(firstLetter) != -1) {
            return word + "ay";
        } else if (firstLetter == 'y') {
            return word.substring(1) + "yay";
        } else {
            int vowelIndex = -1;
            for (int i = 1; i < word.length(); i++) {
                if (vowels.indexOf(word.charAt(i)) != -1 || word.charAt(i) == 'y') {
                    vowelIndex = i;
                    break;
                }
            }
            if (vowelIndex == -1) {
                return word + "ay";
            }
            return word.substring(vowelIndex) + word.substring(0, vowelIndex) + "ay";
        }
    }
}
