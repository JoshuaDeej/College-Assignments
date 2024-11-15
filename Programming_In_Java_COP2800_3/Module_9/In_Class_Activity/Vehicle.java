package Programming_In_Java_COP2800_3.Module_9.In_Class_Activity;

public class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}
