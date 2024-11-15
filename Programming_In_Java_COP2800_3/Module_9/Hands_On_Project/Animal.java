package Programming_In_Java_COP2800_3.Module_9.Hands_On_Project;

// Parent class
public class Animal {
    // Attributes
    protected String name;
    protected int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
