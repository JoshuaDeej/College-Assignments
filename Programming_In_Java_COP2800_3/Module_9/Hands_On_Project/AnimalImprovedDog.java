package Programming_In_Java_COP2800_3.Module_9.Hands_On_Project;

// Modified Child class implementing the Playable interface
public class AnimalImprovedDog extends AnimalImproved implements AnimalImprovedPlayable {
    // Constructor
    public AnimalImprovedDog(String name, int age) {
        super(name, age);
    }

    // Overridden method from Animal class
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    // Implementing the interface method
    @Override
    public void play() {
        System.out.println("Dog plays fetch");
    }
}
