import java.time.LocalDate;
import java.util.Scanner;
public class TestMonthHandling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate[] dates = new LocalDate[2];

        for(int i=0; i<dates.length;i++){
            System.out.print("Enter month >> ");
            int month = input.nextInt();

            System.out.print("Enter day >> ");
            int day = input.nextInt();

            System.out.print("Enter year >> ");
            int year = input.nextInt();

            dates[i]=LocalDate.of(year, month, day);
        }

        for(int i=0; i<dates.length; i++){
            for(int j=0; j<4; j++){
                switch (j) {
                case 0:
                    System.out.println("First date "+dates[i].plusMonths(j));                    
                    break;
                case 1:
                    System.out.println("Second date "+dates[i].plusMonths(j));;                    
                    break;
                case 2:
                    System.out.println("Third date "+dates[i].plusMonths(j));                    
                    break;
                case 3:
                    System.out.println("Fourth date "+dates[i].plusMonths(j));                    
                    break;               
                default:
                    System.out.println("ERROR encountered.");
                    break;
                }
            }
        }
        input.close();
    }
}