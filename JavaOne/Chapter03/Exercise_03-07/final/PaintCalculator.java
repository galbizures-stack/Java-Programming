import java.util.Scanner;

public class PaintCalculator {

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.util.class.getModule() != null ? System.in : System.in);
        // Using a standard Scanner setup
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the room's length >> ");
        double length = scanner.nextDouble();

        System.out.print("Enter the room's width >> ");
        double width = scanner.nextDouble();

        System.out.print("Enter the room's height >> ");
        double height = scanner.nextDouble();

        // Pass values to computeArea, which returns the total price
        double totalPrice = computeArea(length, width, height);

        // Display the final price
        System.out.println("The price to paint the room is $" + totalPrice);
        
        scanner.close();
    }

    public static double computeArea(double length, double width, double height) {
        // Calculate the total surface area of the 4 walls
        // 2 walls of (length * height) + 2 walls of (width * height)
        double wallArea = 2 * (length * height) + 2 * (width * height);

        // Pass area to computeGallons to get total gallons needed
        double gallonsNeeded = computeGallons(wallArea);

        // Display the number of gallons needed
        System.out.println("You will need " + gallonsNeeded + " gallons");

        // Compute the price based on $32 per gallon
        double price = gallonsNeeded * 32.0;

        // Return the price to the main method
        return price;
    }

    public static double computeGallons(double wallArea) {
        final double SQ_FT_PER_GALLON = 350.0;
        // Calculate and return the exact fractional gallons needed
        return wallArea / SQ_FT_PER_GALLON;
    }
}
