package Programming_In_Java_COP2800_3.Module_9.Hands_On_Project;

// Parent class
public class AnimalImproved {
    // Attributes
    protected String name;
    protected int age;

    // Constructor
    public AnimalImproved(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
