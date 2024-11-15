package Programming_In_Java_COP2800_3.Module_10.Hands_On_Project;

public class OutgoingPhoneCall extends PhoneCall {
    private int callTime;

    public OutgoingPhoneCall(String phoneNumber, int callTime) {
        super(phoneNumber);
        this.callTime = callTime;
        setPrice(0.04 * callTime);
    }

    public int getCallTime() {
        return callTime;
    }

    @Override
    public void displayInformation() {
        System.out.println("Outgoing Phone Call");
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Rate per minute: $0.04");
        System.out.println("Call Time: " + getCallTime() + " minutes");
        System.out.println("Price: $" + getPrice());
    }
}
