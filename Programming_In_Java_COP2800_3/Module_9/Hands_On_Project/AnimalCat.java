package Programming_In_Java_COP2800_3.Module_9.Hands_On_Project;

// Child class
public class AnimalCat extends Animal {
    // Constructor
    public AnimalCat(String name, int age) {
        super(name, age);
    }

    // Overridden method
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}
