package Programming_In_Java_COP2800_3.Module_9.In_Class_Activity;

public class ElectricCar extends VehicleCar implements Electric {
    private int batteryCapacity;

    public ElectricCar(String brand, int numberOfDoors, int batteryCapacity) {
        super(brand, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void chargeBattery() {
        System.out.println("Charging the battery with capacity: " + batteryCapacity + " kWh.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}
