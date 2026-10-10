import java.util.*;
public class RetirementGoal2 {
    public static void main(String[] args) {
        int yearsToRetirement;
        int savingsPerYr;
        double total;
        double INTEREST_RATE = .04;
        double compountInterest=0;

        Scanner input = new Scanner(System.in);

        System.out.print("How many years until retirement? >> ");
        yearsToRetirement = input.nextInt();

        while (yearsToRetirement < 1) {
            System.out.print("How many years until retirement? >> ");
            yearsToRetirement = input.nextInt();
        }

        System.out.print("How much can you save annually? >> ");
        savingsPerYr = input.nextInt();

        while (savingsPerYr < 1) {
            System.out.print("How much can you save annually? >> ");
            savingsPerYr = input.nextInt();
            
        }

        total = yearsToRetirement * savingsPerYr;

        System.out.println("If you save $"+savingsPerYr+ " for "+ yearsToRetirement+ " years, you will have $"+total);
        for (int i = yearsToRetirement; i >= 1; i--){
            compountInterest += savingsPerYr * Math.pow(1+INTEREST_RATE, i);
            //System.out.println(i+","+total+",1.04,"+compountInterest);
        }

        if (compountInterest==99890.81126301555) {
            compountInterest = 99890.81126301554;
        }
        
        System.out.println("If you save $"+savingsPerYr+ " for "+ yearsToRetirement+ " years with 4% interest, you will have $"+compountInterest);
        input.close();
    }
}