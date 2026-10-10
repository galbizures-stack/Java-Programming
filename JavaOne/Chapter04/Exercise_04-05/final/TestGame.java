import java.util.Scanner;
public class TestGame {

    public static void main(String[] args) {
        Game tonightGame;

        tonightGame=gameDetails();

        tonightGame.displayGameDetails();        
    }

    public static Game gameDetails(){
        Scanner input = new Scanner(System.in);
        Team teamOne = new Team();
        Team teamTwo = new Team();
        
        System.out.print("Name of first school >> ");
        String schoolOneName = input.nextLine();
        teamOne.setSchool(schoolOneName);

        System.out.print("Enter first school mascot >> ");
        String schoolOneMascot = input.nextLine();
        teamOne.setSchool(schoolOneMascot);

        System.out.print("Name of second school >> ");
        String schoolTwoName = input.nextLine();
        teamTwo.setSchool(schoolTwoName);

        System.out.print("Enter second school mascot >> ");
        String schoolTwoMascot = input.nextLine();
        teamTwo.setSchool(schoolTwoMascot);

        System.out.print("What time is the game >> ");
        String time = input.nextLine();

        return new Game(teamOne, teamTwo, time);
    }


}