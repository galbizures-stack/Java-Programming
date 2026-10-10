import java.util.*;
public class BookstoreCredit {
    public static final double CREDIT = 10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name >> ");
        String name = input.nextLine();

        System.out.print("Enter your GPA >> ");
        double gradePointAverage = input.nextDouble();

        computeDiscount(name, gradePointAverage);        

        input.close();
        
    }

    static void computeDiscount(String name, double gradePointAverage){
        System.out.println(name+", your GPA is "+gradePointAverage
        +", so your credit is $"+gradePointAverage*CREDIT);
    } 
}