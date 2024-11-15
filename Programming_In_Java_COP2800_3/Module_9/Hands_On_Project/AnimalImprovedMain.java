package Programming_In_Java_COP2800_3.Module_9.Hands_On_Project;

// Main class to test inheritance and interface
public class AnimalImprovedMain {
    public static void main(String[] args) {
        // Create an instance of AnimalImprovedDog
        AnimalImprovedDog dog = new AnimalImprovedDog("Buddy", 3);

        // Call the makeSound and play methods
        dog.makeSound();
        dog.play();
    }
}
