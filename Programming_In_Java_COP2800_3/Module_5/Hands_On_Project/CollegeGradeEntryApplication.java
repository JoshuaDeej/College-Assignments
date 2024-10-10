package Programming_In_Java_COP2800_3.Module_5.Hands_On_Project;

import java.util.Scanner;

public class CollegeGradeEntryApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CollegeStudent[] students = new CollegeStudent[10];

        for (int i = 0; i < students.length; i++) {
            students[i] = new CollegeStudent();
            System.out.println("Enter ID for student #" + (i + 1) + ":");
            students[i].setStudentID(scanner.nextLine());

            for (int j = 0; j < 5; j++) {
                CollegeCourse course = new CollegeCourse();
                System.out.println("Enter course ID for course #" + (j + 1) + ":");
                course.setCourseID(scanner.nextLine());

                System.out.println("Enter credit hours for course #" + (j + 1) + ":");
                course.setCreditHours(scanner.nextInt());

                char grade;
                do {
                    System.out.println("Enter grade for course #" + (j + 1) + " (A, B, C, D, F):");
                    grade = scanner.next().charAt(0);
                } while (grade != 'A' && grade != 'B' && grade != 'C' && grade != 'D' && grade != 'F');
                course.setGrade(grade);

                students[i].setCourse(course, j);
                scanner.nextLine(); // Consume newline
            }
        }

        scanner.close();
    }
}
