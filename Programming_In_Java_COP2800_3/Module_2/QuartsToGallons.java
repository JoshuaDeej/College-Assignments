public class QuartsToGallons {
    public static void main(String[] args) {
        // Declare a named constant to hold the number of the quarts in a gallon
        final int  QUART_IN_GALLON = 4;
        // Declare a variable to represent the number of quarts needed for painting Job
        int quartsNeeded = 18;
        // Compute the number of gallons needed
        int gallonsNeeded = quartsNeeded / QUART_IN_GALLON;
        // Compute the number of remaining quarts after determining gallons
        int extraQuarts = gallonsNeeded % QUART_IN_GALLON;
        // Display the results
        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallonsNeeded + " gallons plus " + extraQuarts + " quarts.");
    }
}
