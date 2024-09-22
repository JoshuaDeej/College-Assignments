package Programming_In_Java_COP2800_3.Module_3.Hands_On_Project;

import java.util.ArrayList;

public class Student {
    private String name;
    private int grade;
    private ArrayList<String> courses;

    // Constructor
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    // Method to add a course
    public void addCourse(String course) {
        courses.add(course);
    }

    // Method to remove a course
    public void removeCourse(String course) {
        courses.remove(course);
    }

    // Method to get the student's name
    public String getName() {
        return name;
    }

    // Method to get the student's grade
    public int getGrade() {
        return grade;
    }

    // Method to get the list of courses
    public ArrayList<String> getCourses() {
        return courses;
    }

    // Method to print student details
    public void printStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses: " + courses);
    }

    public static void main(String[] args) {
        // Create a new student
        Student student = new Student("John Doe", 10);

        // Add courses
        student.addCourse("Math");
        student.addCourse("Science");

        // Print student details
        student.printStudentDetails();

        // Remove a course
        student.removeCourse("Math");

        // Print student details again
        student.printStudentDetails();
    }
}
