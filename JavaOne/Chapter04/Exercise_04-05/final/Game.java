public class Game {

    private Team team1, team2;
    private String time;

    public Game(){
        this.team1=new Team();
        this.team2=new Team();
        this.time="";
    }

    public Game(Team team1, Team team2, String time){
        this.team1 = team1;
        this.team2 = team2;
        this.time = time;
    }

    public Team getTeam1(){
        return this.team1;
    }

    public Team getTeam2(){
        return this.team2;
    }

    public String getTime(){
        return this.time;
    }

    public void displayGameDetails(){
        System.out.println("The game between "
        +team1.getSchool()+" "
        +team1.getMascot()+"\n\tand "
        +team2.getSchool()+" "
        +team2.getMascot()+"\n\ttakes place at "
        +getTime());
    }
}