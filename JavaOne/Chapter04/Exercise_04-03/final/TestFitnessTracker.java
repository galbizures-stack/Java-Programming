import java.util.Scanner;
import java.time.LocalDate;
public class TestFitnessTracker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter activity >> ");
        String activity = input.nextLine();
        
        System.out.print("Enter minutes spent "+ activity +" >> ");
        int minutesExercise = input.nextInt();

        System.out.print("Enter month >> ");
        int month = input.nextInt();

        System.out.print("Enter day >> ");
        int day = input.nextInt();

        System.out.print("Enter year >> ");
        int year = input.nextInt();

        LocalDate date = LocalDate.of(year, month, day);

        FitnessTracker fitnessOne = new FitnessTracker(activity, minutesExercise, date);
        FitnessTracker fitnessTwo = new FitnessTracker();

        System.out.println(fitnessOne.getActivity()+" "+fitnessOne.getMinutes()
    +" minutes on "+fitnessOne.getDate());

        System.out.println(fitnessTwo.getActivity()+" "+fitnessTwo.getMinutes()
    +" minutes on "+fitnessTwo.getDate());

        input.close();
    }

    public static String date(int month, int day, int year){
        String date="";

        date += String.valueOf(year);
        date += "-";
        if (month<10 && month>0) {
            date+="0";
            date+=String.valueOf(month);            
        }else if (month>9 && month<13){
            date+=String.valueOf(month);            
        }else{
            System.out.println("Invaling entry for month.");                      
        }
        date+="-";

        if (day<10 && day>0) {
            date+="0";
            date+=String.valueOf(day);            
        }else if (day>9){
            switch (month) {
                case 1: 
                    if (day<32){
                        date+=String.valueOf(day);                    
                    }else{
                        System.out.println("Invalid day for month "+month+".");
                    }                    
                    break;
                case 2:
                    if (year%4==0&&(year%100 != 0 || year%400==0)){
                        if (day<30){
                            date+=String.valueOf(day);                    
                        }else{
                            System.out.println("Invalid day for month "+month+".");
                        }                        
                    }else{
                        if (day<29){
                            date+=String.valueOf(day);                    
                        }else{
                            System.out.println("Invalid day for month "+month+".");
                        }
                    }                    
                    break;
                case 3:
                    if (day<32){
                        date+=String.valueOf(day);                    
                    }else{
                        System.out.println("Invalid day for month "+month+".");
                    }                     
                    break;
                case 4:
                    if (day<31){
                        date+=String.valueOf(day);                    
                    }else{
                        System.out.println("Invalid day for month "+month+".");
                    }                     
                    break;
                case 5:
                    if (day<32){
                        date+=String.valueOf(day);                    
                    }else{
                        System.out.println("Invalid day for month "+month+".");
                    }                     
                    break;
                case 6:
                    if (day<31){
                        date+=String.valueOf(day);                    
                    }else{
                        System.out.println("Invalid day for month "+month+".");
                    }                    
                    break;
                case 7:
                    if (day<32){
                        date+=String.valueOf(day);                    
                    }else{
                        System.out.println("Invalid day for month "+month+".");
                    }                     
                    break;
                case 8:
                    if (day<32){
                        date+=String.valueOf(day);                    
                    }else{
                        System.out.println("Invalid day for month "+month+".");
                    }                     
                    break;
                case 9:
                    if (day<31){
                        date+=String.valueOf(day);                    
                    }else{
                        System.out.println("Invalid day for month "+month+".");
                    }                    
                    break;
                case 10:
                    if (day<32){
                        date+=String.valueOf(day);                    
                    }else{
                        System.out.println("Invalid day for month "+month+".");
                    }                     
                    break;
                case 11:
                    if (day<31){
                        date+=String.valueOf(day);                    
                    }else{
                        System.out.println("Invalid day for month "+month+".");
                    }                    
                    break;
                case 12:
                    if (day<32){
                        date+=String.valueOf(day);                    
                    }else{
                        System.out.println("Invalid day for month "+month+".");
                    }                     
                    break;            
                default:
                    System.out.println("Error: Invalid month entry.");
                    break;
            }
            date+=String.valueOf(day);            
        }else{
            System.out.println("Invaling entry for month.");                       
        }
        return date;
        
    }
}