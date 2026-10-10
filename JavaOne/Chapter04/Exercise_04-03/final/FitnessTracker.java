import java.time.LocalDate;

public class FitnessTracker {
    private int minutes;
    private String activity;
    private LocalDate date;

    public FitnessTracker(){
        this.activity="running";
        this.minutes=0;
        this.date=LocalDate.of(2026,01,01);
    }

    public FitnessTracker(String activityName){
        this.activity=activityName;
        this.minutes=0;
        this.date=LocalDate.of(2026,01,01);
    }
    public FitnessTracker(String activityName, int minuteInput){
        this.activity=activityName;
        this.minutes=minuteInput;
        this.date=LocalDate.of(2026,01,01);
    }

    public FitnessTracker(String activityName, int minuteInput, LocalDate date){
        this.activity=activityName;
        this.date=date;
        this.minutes = minuteInput;
    }

    public String getActivity(){
        return this.activity;
    }
    public LocalDate getDate(){
        return this.date;
    }
    public int getMinutes(){
        return this.minutes;
    }

    public void setActivity(String activityName){
        this.activity=activityName;
    }

    public void setDate(LocalDate newDate){
        this.date=newDate;
    }
    
    public void setMinutes(int minuteInput){
        this.minutes=minuteInput;
    }
    public static void main(String[] args) {
        
    }
}