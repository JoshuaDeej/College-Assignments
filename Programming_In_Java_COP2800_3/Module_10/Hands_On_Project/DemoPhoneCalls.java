package Programming_In_Java_COP2800_3.Module_10.Hands_On_Project;

import java.util.Scanner;

public class DemoPhoneCalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneCall phoneCall;
        String sentinel = "exit";

        while (true) {
            System.out.println("Enter the type of call (Incoming/Outgoing) or 'exit' to quit:");
            String callType = scanner.nextLine();

            if (callType.equalsIgnoreCase(sentinel)) {
                break;
            }

            System.out.println("Enter phone number:");
            String phoneNumber = scanner.nextLine();

            if (callType.equalsIgnoreCase("Incoming")) {
                phoneCall = new IncomingPhoneCall(phoneNumber);
            } else if (callType.equalsIgnoreCase("Outgoing")) {
                System.out.println("Enter call time in minutes:");
                int callTime = scanner.nextInt();
                scanner.nextLine();  // consume the newline
                phoneCall = new OutgoingPhoneCall(phoneNumber, callTime);
            } else {
                System.out.println("Invalid call type.");
                continue;
            }

            phoneCall.displayInformation();
            System.out.println();
        }
    }
}
