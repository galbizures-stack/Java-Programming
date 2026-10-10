import java.util.*;
public class InchConversion {
    public static final double INCHES_PER_FT = 12;
    public static final double INCHES_PER_YARD = 36;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter inches >> ");
        int inches = input.nextInt();
        outputResult(inches);

        input.close();        
    }

    static double convertToFeet(int inches){
        return inches/INCHES_PER_FT;
    }

    static double convertToYards(int inches){
        return inches/INCHES_PER_YARD;
    }

    static void outputResult(int inches){
        System.out.println(inches+" inches is "+convertToFeet(inches)
        +" feet");
        System.out.println(inches+" inches is "+convertToYards(inches)
        +" yards");
    }
}