import java.util.*;
public class Factorials {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numInput;
        int factorialnum=1;

        System.out.print("Enter a number to compute factorial >> ");
        numInput = input.nextInt();

        for (int i = 1; i<=numInput; i++){
            factorialnum *= i;
            System.out.println("The factorial of "+ i + " is "+ factorialnum);
        }
    }
}