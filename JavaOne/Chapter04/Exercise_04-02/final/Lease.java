public class Lease {
    private String name;
    private int aptNumber;
    private double rent;
    private  int term;

    public Lease(){
        this.name = "XXX";
        this.aptNumber = 0;
        this.rent = 1000;
        this.term = 12;
    }

    public Lease(String name, int apartment, double rent, int term){
        this.name = name;
        this.aptNumber = apartment;
        this.rent = rent;
        this.term = term;
    }

    public int getAptNumber() {
        return aptNumber;
    }
    public String getName() {
        return name;
    }
    public double getRent() {
        return rent;
    }

    public int getTerm() {
        return term;
    }

    public void setAptNumber(int aptNumber) {
        this.aptNumber = aptNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }
    public void setTerm(int term) {
        this.term = term;
    }

    public static void explainPetPolicy(){
        System.out.print("$10 additional fee will be added to tenants with pets\n");
    }
    public void addPetFee(){
        this.rent+=10;
        explainPetPolicy();
    }    
}