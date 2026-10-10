import java.util.*;
public class TestLease {

    public static void showValues(Lease tenant){
        System.out.print("\nYour lease results: \n");
        System.out.print("Name\t\t: "+tenant.getName());
        System.out.print("\nApartment\t: "+tenant.getAptNumber());
        System.out.print("\nRent\t\t: "+tenant.getRent());
        System.out.println("\nTerm\t\t: "+tenant.getTerm());
        System.out.println();
    }

    public static Lease getData(){
        Scanner input = new Scanner(System.in);

        System.out.print("Please input tenant name: ");
        String name = input.nextLine();
        
        
        System.out.print("Please input apartment number: ");
        int apartment = input.nextInt();
        

        System.out.print("Please input rent rate: ");
        double rent = input.nextDouble();
        

        System.out.print("Please input term: ");
        int term = input.nextInt();
        

        return new Lease(name, apartment, rent, term);
    }

    public static void main(String[] args) {
        
        Lease lease1 = getData();
        lease1.addPetFee();
        
        Lease lease2 = getData();
        Lease lease3 = getData();
        Lease lease4 = new Lease();

        showValues(lease1);
        showValues(lease2);
        showValues(lease3);
        showValues(lease4); 
    
    }
}