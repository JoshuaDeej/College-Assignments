package Programming_In_Java_COP2800_3.Module_2.Hands_On_Project;

public class Employee {
    // Attributes
    private String name;
    private String jobTitle;
    private double salary;

    // Constructor
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for jobTitle
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // Getter and Setter for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to raise salary by a percentage
    public void raiseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * percentage / 100;
        }
    }

    // Method to print employee details
    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", "Software Engineer", 75000);
        emp.printEmployeeDetails();

        // Update salary
        emp.raiseSalary(10);
        System.out.println("\nAfter 10% raise:");
        emp.printEmployeeDetails();
    }
}
