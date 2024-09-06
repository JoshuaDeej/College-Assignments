import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        System.out.print("Enter an age: ");
        int age = scanner.nextInt();

        // Display the input data
        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}
