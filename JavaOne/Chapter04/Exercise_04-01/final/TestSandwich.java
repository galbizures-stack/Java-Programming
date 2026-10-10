import java.util.*;
public class TestSandwich {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double price;

        Sandwich sandwichOrder = new Sandwich();

        System.out.print("Enter main sandwich ingredient >> ");
        String ingredient = input.nextLine();
        sandwichOrder.setMainIngredient(ingredient);

        System.out.print("Enter bread type >> ");
        String breadType = input.nextLine();
        sandwichOrder.setBread(breadType);

        System.out.print("Enter sandwich price");
        price = input.nextDouble();
        sandwichOrder.setPrice(price);

        System.out.print("You have ordered a "+sandwichOrder.getMainIngredient()+" sandwich on "
        +sandwichOrder.getBread()+" bread, and the price is $"+sandwichOrder.getPrice());

        input.close();
    }    
}