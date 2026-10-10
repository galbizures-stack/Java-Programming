import java.util.Scanner;
public class InchesToFeetInteractive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inches = 86;
        int feet;
        int inchesLeft;

        System.out.print("Please input inches as int. ");
        inches = input.nextInt();

        feet = inches / 12;
        inchesLeft = inches % 12;

        input.close();

        System.out.print(inches+" inches is "+feet+" feet and "+inchesLeft+" inches\n");
    }
}