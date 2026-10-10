import java.util.*;
public class NumbersDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer >> ");
        //input intOne
        int intOne = input.nextInt();
        System.out.println();
        
        System.out.print("Enter another integer >> ");
        //input intTwo
        int intTwo = input.nextInt();
        System.out.println();

        displayOutput(intOne);
        displayOutput(intTwo);

        input.close();

    }
static int displayTwiceTheNumber(int number){

    return number*2;

    }

static int displayNumberPlusFive(int number){
    return number + 5;

    }

static int displayNumberSquared(int number){
    return number*number;
    }

static void displayOutput(int number){
    System.out.print(number+" times 2 is "
    +displayTwiceTheNumber(number));
    System.out.println();
    System.out.print(number+" plus 5 is "
    +displayNumberPlusFive(number));
    System.out.println();
    System.out.print(number+" squared is "
    +displayNumberSquared(number));
    System.out.println();
}
}