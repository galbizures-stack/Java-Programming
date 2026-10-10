import java.util.Scanner;
public class ChiliToGoProfit {
    public static double ADULT_MEAL_PRICE = 7.0;
    public static double ADULT_MEAL_PRICE_COST = 4.35;
    public static double KID_MEAL_PRICE = 4.0;
    public static double KID_MEAL_PRICE_COST = 3.10;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int adultMeals;
        int kidMeals;
        double adultMealsTotal, kidMealsTotals, adultProfit, kidProfit, total;
        
        System.out.print("Enter number of adult meals ordered >> ");
        adultMeals = input.nextInt();
        System.out.print("Enter number of child meals ordered >> ");
        kidMeals = input.nextInt();
        System.out.printf(adultMeals+" adult meals were ordered at $"+ADULT_MEAL_PRICE+" each.\n");
        adultMealsTotal = ADULT_MEAL_PRICE*adultMeals;
        System.out.print("\tTotal is $"+adultMealsTotal+"\n");
        System.out.print(kidMeals+" child meals were ordered at $"+KID_MEAL_PRICE+" each.\n");
        kidMealsTotals = KID_MEAL_PRICE*kidMeals;
        System.out.print("\tTotal is $"+kidMealsTotals);
        total = (KID_MEAL_PRICE*kidMeals+ADULT_MEAL_PRICE*adultMeals);
        System.out.print("\nGrand total for all meals is $"+total+"\n");

        adultProfit = (ADULT_MEAL_PRICE-ADULT_MEAL_PRICE_COST)*adultMeals;
        kidProfit = (KID_MEAL_PRICE-KID_MEAL_PRICE_COST)*kidMeals;


        System.out.print("Profits:\n"
        +"\tAdult profit is $"+adultProfit
        +"\n\tChild profit is $"+kidProfit
        +"\nTotal profit is $"+(double)(adultProfit+kidProfit)+"\n");

        input.close();
    }
}