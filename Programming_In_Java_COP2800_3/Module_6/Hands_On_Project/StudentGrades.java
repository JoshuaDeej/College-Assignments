package Programming_In_Java_COP2800_3.Module_6.Hands_On_Project;

public class StudentGrades {
    public static void main(String[] args) {
        // Initialize Student Data
        String[] students = {"Alice", "Bob", "Charlie", "Diana", "Eve"};
        int[] grades = {85, 92, 76, 88, 95};

        // Display Student Grades
        System.out.println("Student Grades:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " - Grade: " + grades[i]);
        }

        // Calculate the Average Grade
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = sum / grades.length;
        System.out.println("\nAverage Grade: " + average);

        // Finding the Highest and Lowest Grades
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            System.out.println("\nEnter 1 to see the highest grade, 2 to see the lowest grade, or 0 to exit:");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            int index = 0;
            if (choice == 1) {
                for (int i = 1; i < grades.length; i++) {
                    if (grades[i] > grades[index]) {
                        index = i;
                    }
                }
                System.out.println("Highest Grade: " + students[index] + " - " + grades[index]);
            } else if (choice == 2) {
                for (int i = 1; i < grades.length; i++) {
                    if (grades[i] < grades[index]) {
                        index = i;
                    }
                }
                System.out.println("Lowest Grade: " + students[index] + " - " + grades[index]);
            } else {
                System.out.println("Invalid option. Please enter 1, 2, or 0.");
            }
        }

        // Categorize Students Based on Grades
        System.out.println("\nGrade Categories:");
        StringBuilder aGrade = new StringBuilder("A Grade: ");
        StringBuilder bGrade = new StringBuilder("B Grade: ");
        StringBuilder cGrade = new StringBuilder("C Grade: ");

        outer:
        for (int i = 0; i < students.length; i++) {
            int grade = grades[i];
            switch (grade / 10) {
                case 10:
                case 9:
                    aGrade.append(students[i]).append(", ");
                    break;
                case 8:
                    bGrade.append(students[i]).append(", ");
                    break;
                case 7:
                    cGrade.append(students[i]).append(", ");
                    break;
                default:
                    continue outer;
            }
        }

        System.out.println(aGrade.substring(0, aGrade.length() - 2)); // Removing last comma and space
        System.out.println(bGrade.substring(0, bGrade.length() - 2));
        System.out.println(cGrade.substring(0, cGrade.length() - 2));
    }
}
