import java.util.*;
public class JobPricing {
    public static final double LABOR_HOURLY = 35;
    public static final double TRAVEL_EXPENSE_HOURLY = 12;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter job description >> ");
        String description = input.nextLine();

        System.out.print("Enter cost of materials >> ");
        double materials = input.nextDouble();

        System.out.print("Enter hours on the job work >> ");
        double hoursWork = input.nextDouble();

        System.out.print("Enter hours traveling >> ");
        double travelHrs = input.nextDouble();

        double estimateCost = computePrice(materials, hoursWork, travelHrs);
        
        System.out.println("The price for "+description+" is $"
        +estimateCost);

        input.close();
        
    }

    public static double costManHours(double hours){
        return LABOR_HOURLY*hours;
    }

    public static double costTravel(double hours){
        return TRAVEL_EXPENSE_HOURLY*hours;
    }

    public static double computePrice(double materials, double manHours, double travel){
        double labor = costManHours(manHours);
        double travelExpense = costTravel(travel);
        return materials + labor + travelExpense;
    }
}