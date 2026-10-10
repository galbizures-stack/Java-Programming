import java.util.Scanner;

public class ShadyRestRoom2 {
    static void bedSelectionMessage(int selection){
        if (selection == 1) {
            System.out.print("You selected Queen bed ");
                       
        }else if (selection == 2) {
            System.out.print("You selected King bed ");
                       
        }else{
            System.out.print("You selected a Suite with a King bed and pull-out couch ");
            
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
        static double viewSelectedPrice(int selection){
        if (selection == 1) {
            return 15;            
        }else{
            return 0;            
        }
    }

    static void viewSelectedMessage(int selection){
        if (selection == 1) {
            System.out.print("with a lake view for $");
        } else {
            System.out.print("with a park view for $");            
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price = 0;
        int selection, viewSelection;

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
            
            
            System.out.print("Please choose a view:\n");
            System.out.print("(1) a lake\n(2) a park\n");
            System.out.print("Enter Selection (1 or 2) >> ");
            viewSelection = input.nextInt();
            if(viewSelection <1 || viewSelection >2){
                viewSelection = 1;
                System.out.println("Invalid view.");
                bedSelectionMessage(selection);
                viewSelectedMessage(viewSelection);
                price += viewSelectedPrice(viewSelection);
                System.out.println(price);
                
            }else{
                bedSelectionMessage(selection);
                viewSelectedMessage(viewSelection);
                price += viewSelectedPrice(viewSelection);
                System.out.println(price);
            }
        }

        input.close();
    
    }
    
}