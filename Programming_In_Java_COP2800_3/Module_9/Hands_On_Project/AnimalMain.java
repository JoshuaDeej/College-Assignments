package Programming_In_Java_COP2800_3.Module_9.Hands_On_Project;

// Main class to test inheritance
public class AnimalMain {
    public static void main(String[] args) {
        // Create instances of child classes
        Animal dog = new AnimalDog("Buddy", 3);
        Animal cat = new AnimalCat("Whiskers", 2);

        // Call the makeSound method
        dog.makeSound();
        cat.makeSound();
    }
}
