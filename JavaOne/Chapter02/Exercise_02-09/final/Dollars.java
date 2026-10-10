// Write your code here
import java.util.Scanner;;
class Dollars{
    public static void main(String[] args) {
        int moneyInput;
        int twentyBill;
        int tenBill;
        int fiveBill;
        int oneBill;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number of dollars ");
        moneyInput = input.nextInt();

        System.out.print("$"+moneyInput);

        twentyBill = moneyInput /20;
        moneyInput = moneyInput % 20;
        tenBill = moneyInput /10;
        moneyInput = moneyInput % 10;
        fiveBill = moneyInput /5;
        moneyInput = moneyInput % 5;
        oneBill = moneyInput;

        System.out.print(" is "+twentyBill + " $20s, "+ tenBill +" $10s "+ fiveBill +" $5s and "+oneBill + " $1s\n");
        input.close();

        

        
    }
}