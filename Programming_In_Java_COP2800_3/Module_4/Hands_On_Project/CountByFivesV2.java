package Programming_In_Java_COP2800_3.Module_4.Hands_On_Project;

import java.util.Scanner;

public class CountByFivesV2 {
    public static final int START = 5;
    public static final int STOP = 500;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to count by: ");
        int countBy = scanner.nextInt();

        int count = 0;
        for (int i = START; i <= STOP; i += countBy) {
            System.out.print(i + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
        scanner.close();
    }
}
