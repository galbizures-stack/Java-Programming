public class InchesToFeet {
    public static void main(String[] args) {
        int inches = 86;
        int feet;
        int inchesLeft;

        feet = inches / 12;
        inchesLeft = inches % 12;

        System.out.print(inches+" inches is "+feet+" feet and "+inchesLeft+" inches\n");
    }
}