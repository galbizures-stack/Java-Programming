import java.util.Scanner;
public class TwelveDays {
    static void placeOfDay(int dayInput){
        switch (dayInput) {
            case 1:
                System.out.print(dayInput+"st ");
                break;
            case 2:
                System.out.print(dayInput+"nd ");
                break;
            case 3:
                System.out.print(dayInput+"rd ");
                break;
            default:
                System.out.print(dayInput+"th ");
                break;
            }
        }
    static void christmasDays(int dayInput){
        switch (dayInput) {
            case 1:
                System.out.println("A partridge in a pear tree");                
                break;
            case 2:
                System.out.println("Two turtle doves and");
                break;
            case 3:
                System.out.println("Three French hens");
                break;
            case 4:
                System.out.println("Four calling birds");
                break;
            case 5:
                System.out.println("Five golden rings");
                break;
            case 6:
                System.out.println("Six geese a-laying");
                break;
            case 7:
                System.out.println("Seven swans a-swimming");
                break;
            case 8:
                System.out.println("Eight maids a-milking");
                break;
            case 9:
                System.out.println("Nine ladies dancing");
                break;
            case 10:
                System.out.println("Ten lords a-leaping");
                break;
            case 11:
                System.out.println("Eleven pipers piping");
                break;
            case 12:
                System.out.println("Twelve drummers drumming");
                break; 
            default:
                break;
        }
    }
        public static void main(String[] args) {
            int inputDay;

            Scanner input = new Scanner(System.in);

            System.out.print("From what day do you want to start\n");
            System.out.print("the song The Twelve Days of Christmas? >> ");
            inputDay = input.nextInt();
            if (inputDay>0&&inputDay<13) {
                System.out.print("On the ");
                placeOfDay(inputDay);
                System.out.print("day of Christmas\nMy true love gave to me\n");
                //christmasDays(inputDay);
                // Counts from 1 up to 5
                while (inputDay>0) {
                    christmasDays(inputDay);
                    inputDay--;
                    }
            
            }else{
                System.out.print("Invalid entry.\n");
            }

            input.close();
        }

    
}