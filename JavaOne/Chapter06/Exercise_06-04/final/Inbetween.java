import java.util.*;
public class Inbetween{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int startNumInput, endNumInput;

        System.out.print("Enter an integer >> ");
        startNumInput = input.nextInt();
        System.out.print("Enter another integer >> ");
        endNumInput = input.nextInt();

        System.out.print("The number between "+startNumInput + " and "+ endNumInput
            + " include: ");

        for (int i = startNumInput+1; i < endNumInput; i++){
            System.out.print(i+ " ");
            if (i == endNumInput-1) {
                System.out.println();
            }
        }

        input.close();        
    }
}