package Programming_In_Java_COP2800_3.Module_10.Hands_On_Project;

public class IncomingPhoneCall extends PhoneCall {

    public IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        setPrice(0.02);
    }

    @Override
    public void displayInformation() {
        System.out.println("Incoming Phone Call");
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Rate: $0.02");
        System.out.println("Price: $" + getPrice());
    }
}
