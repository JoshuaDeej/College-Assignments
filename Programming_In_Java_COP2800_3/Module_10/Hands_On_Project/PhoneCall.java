package Programming_In_Java_COP2800_3.Module_10.Hands_On_Project;

public abstract class PhoneCall {
    private String phoneNumber;
    private double price;

    public PhoneCall(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.price = 0.0;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void displayInformation();
}
