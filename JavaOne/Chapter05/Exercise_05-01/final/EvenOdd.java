import java.util.Scanner;
public class EvenOdd{

    static Boolean isEven(int userInputNumber){
        if (userInputNumber%2==0) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number >> ");
        number = input.nextInt();

        if (isEven(number)==true) {
            System.out.print(number+" is even.\n");  
        }else {
            System.out.print(number +" is odd.\n");
        }
    }
}