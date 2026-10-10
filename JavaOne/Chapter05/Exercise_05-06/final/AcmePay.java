import java.util.Scanner;
public class AcmePay {

    static double rateOfShift(int shift){
        if (shift == 1) {
            return 17;            
        }else if (shift ==2) {
            return 18.5;            
        }else{
            return 22;
        }
    }
    static boolean retirementPlan(int selectionRetire){
        if (selectionRetire == 1) {
            return true;            
        }else{
            return false;
        }
    }

    static void calculatePay(int shift, double rateOfShift, double hoursWorked, int retireSelect){
        double total, OT_total, netPay;
        System.out.print("Hours worked is\t\t"+hoursWorked);
        System.out.print("\nShift:\t\t\t"+shift);
        System.out.print("\nHourly pay rate is\t"+ rateOfShift);
        
        total = hoursWorked*rateOfShift;
        
        if (hoursWorked>40) {
            total = 40*rateOfShift;
            System.out.print("\nRegular pay is\t\t"+total);
            OT_total = (hoursWorked-40)*rateOfShift*1.5;
            System.out.print("\nOvertime pay is\t\t"+OT_total);
            total = total + OT_total;
        }else{
            total = hoursWorked*rateOfShift;
            System.out.print("\nRegular pay is\t\t"+total);
            System.out.print("\nOvertime pay is\t\t$0.00");
        }
        if (shift != 1 && retirementPlan(retireSelect)==true) {
            System.out.println("\nRetirement deduction is $"+(total*.03));
            netPay=total*.97;
            System.out.printf("\tNet pay is..............%.2f\n",netPay);                        
            //System.out.printf("%.2f", value); 
        }else{
            System.out.println("\nRetirement deduction is $0");
            netPay=total;
            System.out.println("\tNet pay is.............."+netPay);
        }
        
        
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int shift, retirementSelect;
        double hoursWorkedInput;
        System.out.print("Please enter shift - 1, 2, or 3 >> ");
        shift = input.nextInt();
        System.out.print("Please enter hours worked (can be a fraction) >> ");
        hoursWorkedInput = input.nextDouble();
        if (shift==2 || shift==3) {
            System.out.print("Do you want to participate in the retirement plan?\n\tEnter 1 for Yes and 2 for No >> ");
            retirementSelect = input.nextInt();
            if (retirementSelect==1) {
                calculatePay(shift, rateOfShift(shift), hoursWorkedInput, 1);
            }else{
                calculatePay(shift, rateOfShift(shift), hoursWorkedInput, 0);
            }            
        }else{
            calculatePay(shift, rateOfShift(shift), hoursWorkedInput, 0);
        }     
        input.close();
    }    
}