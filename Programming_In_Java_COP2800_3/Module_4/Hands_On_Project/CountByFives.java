package Programming_In_Java_COP2800_3.Module_4.Hands_On_Project;

public class CountByFives {
    // Define final constants
    public static final int START = 5;
    public static final int STOP = 500;

    public static void main(String[] args) {
        // Loop from START to STOP, counting by 5
        for (int i = START; i <= STOP; i += 5) {
            System.out.print(i + " ");
            // Start a new line after every multiple of 50
            if (i % 50 == 0) {
                System.out.println();
            }
        }
    }
}
