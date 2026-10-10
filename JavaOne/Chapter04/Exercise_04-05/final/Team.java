public class Team {

    private String school, sport, mascot;
    private final static  String MOTTO = "Sportsmanship!";

    public Team(){
        this.school = "";
        this.sport = "";
        this.mascot = "";
    }

    public Team(String school, String sport, String mascot){
        this.school=school;
        this.sport=sport;
        this.mascot=mascot;
    }

    public void setSchool(String school){
        this.school=school;
    }

    public void setSport(String sport){
        this.sport = sport;
    }

    public void setMascot(String mascot){
        this.mascot=mascot;
    }

    public String getSchool(){
        return this.school;
    }
    
    public String getSport(){
        return this.sport;
    }
    
    public String getMascot(){
        return this.mascot;
    }

    public String getMotto(){
        return this.MOTTO;
    }

    public void displayData(){
        System.out.println(getSchool()+" "+getSport()+" team "+getMascot());
        System.out.println("\tOur motto is "+getMotto());
    }

    public static void main(String[] args) {
        //
    }
}