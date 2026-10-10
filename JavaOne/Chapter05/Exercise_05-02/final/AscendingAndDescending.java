import java.util.Scanner;
public class AscendingAndDescending{

    static void ascending(int num1, int num2, int num3){
        System.out.print("Ascending: ");
        if(num1<num2 && num1<num3){
            System.out.print(num1+" ");
            if (num2<num3) {
                System.out.print(num2+" "+num3);                
            }else{
                System.out.print(num3+ " "+num2);
            }
        }else if(num2<num1 && num2<num3){
            System.out.print(num2+" ");
            if (num1<num3) {
                System.out.print(num1+" "+ num3);                    
                }else{
                    System.out.print(num3 + " " + num1);
                }
        }else{
            System.out.print(num3+" ");
            if (num1<num2) {
                System.out.print(num1+" "+num2);                
            }else{
                System.out.print(num2+" "+num1);
            }
        }
        System.out.println();
    }

    static void descending(int num1, int num2, int num3){
        System.out.print("Descending: ");
        if(num1>num2 && num1>num3){
            System.out.print(num1+" ");
            if (num2>num3) {
                System.out.print(num2+" "+num3);                
            }else{
                System.out.print(num3+ " "+num2);
            }
        }else if(num2>num1 && num2>num3){
            System.out.print(num2+" ");
            if (num1>num3) {
                System.out.print(num1+" "+ num3);                    
                }else{
                    System.out.print(num3 + " " + num1);
                }
        }else{
            System.out.print(num3+" ");
            if (num1>num2) {
                System.out.print(num1+" "+num2);                
            }else{
                System.out.print(num2+" "+num1);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer... ");
        num1 = input.nextInt();
        System.out.print("And another... ");
        num2 = input.nextInt();
        System.out.print("And just one more... ");
        num3 = input.nextInt();

        input.close();

        ascending(num1,num2,num3);
        descending(num1,num2,num3);
        
    }
}