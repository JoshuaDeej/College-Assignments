package Programming_In_Java_COP2800_3.Module_3.Hands_On_Project;

import java.time.LocalDate;
import java.time.Period;

public class Employee_Unit3 {
    private String name;
    private double salary;
    private LocalDate hireDate;

    // Constructor
    public Employee_Unit3(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter for hire date
    public LocalDate getHireDate() {
        return hireDate;
    }

    // Setter for hire date
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    // Method to calculate years of service
    public int getYearsOfService() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    // Method to print employee details
    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Years of Service: " + getYearsOfService());
    }

    public static void main(String[] args) {
        // Example usage
        Employee_Unit3 employee = new Employee_Unit3("John Doe", 50000, LocalDate.of(2015, 5, 20));
        employee.printEmployeeDetails();
    }
}
