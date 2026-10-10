import java.util.*;
public class Percentages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Functions percentTwoNums = new Functions();

        System.out.print("Enter a double >> ");
        double num1 = input.nextDouble();

        System.out.print("Enter another double >> ");
        double num2 = input.nextDouble();

        System.out.println(num1+" is "
        +computePercent(num1, num2)+" percent of "+num2);

        System.out.println(num2+" is "
        +computePercent(num2, num1)+" percent of "+num1);


        //percentTwoNums.percentageOfGivenValues(num1, num2);
        //percentTwoNums.percentageOfGivenValues(num2, num1);

        input.close();
        
    } 
    static double computePercent(double var0, double var2) {
      return var0 / var2 * (double)100.0F;
   }   
}