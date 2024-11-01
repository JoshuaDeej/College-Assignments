package Programming_In_Java_COP2800_3.Module_8.Hands_On_Project;

import java.util.Scanner;

public class StudentGradesV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        int numberOfStudents = 3;
        int numberOfSubjects = 4;

        // Array to store grades
        double[][] grades = new double[numberOfStudents][numberOfSubjects];

        // Input grades
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter grades for student " + (i + 1) + ":");
            for (int j = 0; j < numberOfSubjects; j++) {
                while (true) {
                    System.out.println("Subject " + (j + 1) + ":");
                    if (scanner.hasNextDouble()) {
                        grades[i][j] = scanner.nextDouble();
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter a valid number.");
                        scanner.next(); // Clear invalid input
                    }
                }
            }
        }

        // Calculate and display averages, highest and lowest grades
        for (int i = 0; i < numberOfStudents; i++) {
            double sum = 0;
            for (int j = 0; j < numberOfSubjects; j++) {
                sum += grades[i][j];
            }
            double average = sum / numberOfSubjects;
            System.out.println("Average grade for student " + (i + 1) + ": " + average);
        }

        for (int j = 0; j < numberOfSubjects; j++) {
            double highest = grades[0][j];
            double lowest = grades[0][j];
            for (int i = 1; i < numberOfStudents; i++) {
                if (grades[i][j] > highest) highest = grades[i][j];
                if (grades[i][j] < lowest) lowest = grades[i][j];
            }
            System.out.println("Highest grade in subject " + (j + 1) + ": " + highest);
            System.out.println("Lowest grade in subject " + (j + 1) + ": " + lowest);
        }

        scanner.close();
    }
}
