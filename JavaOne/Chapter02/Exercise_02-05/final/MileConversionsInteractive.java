import java.util.Scanner;

class MileConversionsInteractive{
    public static final double INCHES_IN_MILE = 63360;
    public static final double FEET_IN_MILE = 5280;
    public static final double YARDS_IN_MILE = 1760;

    public static void main(String[] args) {   
        Scanner input = new Scanner(System.in);
        double miles;

        System.out.print("Enter miles >> ");
        miles = input.nextDouble();

        System.out.print(miles+" miles is "+miles*INCHES_IN_MILE+" inches, " + miles*FEET_IN_MILE +" feet, or "+ miles*YARDS_IN_MILE +" yards\n");
        input.close();
        
    }
}