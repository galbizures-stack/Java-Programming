import java.util.*;
public class Insurance {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current year >> ");
        int currentYear = input.nextInt();

        System.out.print("Enter the birth year >> ");
        int dobYear = input.nextInt();

        System.out.println("The premium is $"+calculatePremium(currentYear, dobYear));
        input.close();
        
    }
    

public static int calculatePremium(int currentYear, int dobYear){
    int yearDiff = currentYear - dobYear;
    yearDiff = ((yearDiff/10) + 15)*20;
     return yearDiff;
    }
}