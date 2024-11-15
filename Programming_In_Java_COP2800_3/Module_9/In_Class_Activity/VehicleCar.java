package Programming_In_Java_COP2800_3.Module_9.In_Class_Activity;

public class VehicleCar extends Vehicle {
    private int numberOfDoors;

    public VehicleCar(String brand, int numberOfDoors) {
        super(brand); // Calls the constructor of Vehicle
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        displayBrand(); // Calls the method from Vehicle
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
