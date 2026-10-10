// Write your code here
/*
Part A
Implement the MileConversions class so that it declares the following
 named constants: INCHES_IN_MILE, FEET_IN_MILE, and YARDS_IN_MILE. 
 Each constant to represent the number of inches, feet, and yards in a 
 mile.

Next declare a variable named miles to represent a number of miles and 
assign a value to it.

Compute and display, with explanatory text, the value in
 inches, feet, and yards.
*/

class MileConversions{
    public static final double INCHES_IN_MILE = 63360;
    public static final double FEET_IN_MILE = 5280;
    public static final double YARDS_IN_MILE = 1760;

    public static void main(String[] args) {   
        
        double miles = 4.5;

        System.out.print("Enter miles >> "+miles+"\n");
        System.out.print(miles+" miles is "+miles*INCHES_IN_MILE+" inches, " + miles*FEET_IN_MILE +" feet, or "+ miles*YARDS_IN_MILE +" yards\n");
        
    }
}