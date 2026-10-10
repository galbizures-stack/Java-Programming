import java.util.Scanner;

public class ShadyRestRoom {
    static void bedSelectionMessage(int selection){
        if (selection == 1) {
            System.out.print("You selected Queen bed\t$");
                       
        }else if (selection == 2) {
            System.out.print("You selected King bed\t$");
                       
        }else{
            System.out.print("You selected a Suite with a King bed and pull-out couch\t$");
            
        }
    }
        static double bedSelectionPrice(int selection){
        if (selection == 1) {
            return 125;            
        }else if (selection == 2) {
            return 139;            
        }else{
            return 165;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price = 0;
        int selection;

        System.out.print("Menu\n\n");
        System.out.println("(1) Queen bed");        
        System.out.println("(2) King bed");
        System.out.println("(3) Suite with a king bed and pull-out couch");

        System.out.print("Enter Selection (1, 2, or 3) >> ");
        selection = input.nextInt();
        if (selection <1 || selection>3) {
            price = 0;
            System.out.println("Invalid entry. $"+price);
            
        }else{
            price += bedSelectionPrice(selection);
            bedSelectionMessage(selection);
            System.out.println(price);
        }

        input.close();
    
    }
    
}