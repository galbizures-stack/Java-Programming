import java.util.Scanner;
public class TestTeam {

    public static void main(String[] args) {
        Team[] teams = new Team[3];
        /*
        Team teamOne;
        Team teamTwo;
        Team teamThree;

        teamOne = setTeamData();
        teamTwo = setTeamData();
        teamThree = setTeamData();

        teamOne.displayData();
        teamTwo.displayData();
        teamThree.displayData();
        */
       for(int i=0; i<teams.length; i++){
        teams[i]=setTeamData();
       }

       for(int i=0; i<teams.length; i++){
        teams[i].displayData();
       }
        
    }

    public static Team setTeamData(){        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter school name >> ");
        String name = input.nextLine();

        System.out.print("Enter sport >> ");
        String sport = input.nextLine();

        System.out.print("Enter mascot >> ");
        String mascot = input.nextLine();
        
        return new Team(name,sport,mascot);
    }
}