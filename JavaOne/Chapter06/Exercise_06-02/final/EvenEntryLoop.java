import java.util.*;
public class EvenEntryLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numInput;

        System.out.print("Enter an even number or 999 to quit >> ");
        numInput = input.nextInt();

        while (!(numInput==999)) {            
            
            if (numInput%2==0) {
                System.out.print("Good job!\n");
                System.out.print("Enter an even number or 999 to quit >> ");
                numInput = input.nextInt();                
            }else{
                System.out.print(numInput + " is not an even number\n");
                System.out.print("Enter an even number or 999 to quit >> ");
                numInput = input.nextInt();
            }
        }

        input.close();
    }
}