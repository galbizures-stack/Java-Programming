import java.util.Scanner;
public class Eggs{
        public static double PRICE_PER_DOZ = 3.25;
        public static double PRICE_PER_SINGLE = .45;
    public static void main(String[] args) {
        double total;
        Scanner input = new Scanner(System.in);

        int eggs;

        System.out.print("Input number of eggs: ");
        eggs = input.nextInt();

        total = (eggs/12)*PRICE_PER_DOZ + (eggs%12)*PRICE_PER_SINGLE;

        System.out.print("You ordered "+eggs+" eggs. That's "+eggs/12+" dozen at $"+PRICE_PER_DOZ+" per dozen and "
            +eggs%12+" loose eggs at "+(int)(PRICE_PER_SINGLE*100)+" cents"
            +" each for a total of $"+ total + ".\n");

        input.close();
    }
}