import java.util.Scanner;
public class CountByAnything {

    public static void main(String[] args) {
        int numberInput;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to count by >> ");
        numberInput = input.nextInt();
        for (int i = numberInput; i <=500; i+=numberInput ) {
            System.out.print(i+" ");
            if (i%(numberInput*10)==0) {
                System.out.print("\n");
            }
        }
        input.close();
        System.out.print("\n");
    }
}