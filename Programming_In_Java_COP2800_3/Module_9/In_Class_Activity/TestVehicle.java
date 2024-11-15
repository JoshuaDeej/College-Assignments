package Programming_In_Java_COP2800_3.Module_9.In_Class_Activity;

public class TestVehicle {
    public static void main(String[] args) {
        ElectricCar myElectricCar = new ElectricCar("Tesla", 4, 100);
        myElectricCar.displayDetails();
        myElectricCar.chargeBattery();
    }
}
