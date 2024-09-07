package Programming_In_Java_COP2800_3.Module_1.Hands_On_Project;

// Define the Dog class
public class Dog {
    // Private attributes for name and breed
    private String name;
    private String breed;

    // Constructor to initialize the attributes
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }

    // Setter for breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Main method to create and modify Dog instances
    public static void main(String[] args) {
        // Create two instances of the Dog class
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Charlie", "Bulldog");

        // Print initial values
        System.out.println(dog1.getName() + " is a " + dog1.getBreed() + ".");
        System.out.println(dog2.getName() + " is a " + dog2.getBreed() + ".");

        // Modify the attributes using setter methods
        dog1.setBreed("Labrador Retriever");
        dog2.setName("Daisy");

        // Print updated values
        System.out.println(dog1.getName() + " is now a " + dog1.getBreed() + ".");
        System.out.println(dog2.getName() + " is now a " + dog2.getBreed() + ".");
    }
}
