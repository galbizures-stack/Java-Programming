public class QuartsToGallons{
    //public int quartsNeeded = 18;
    
    public static void quartsToGallons(int quartsNeeded){
        int gallons = 0;
        //int quartsNeeded;
        final int QUARTS_IN_GALLON = 4;
        

        gallons = quartsNeeded/QUARTS_IN_GALLON;
        //quarts = quartsNeeded%QUARTS_IN_GALLON;
        String messageString = "A job that needs "+ quartsNeeded + " quarts requires "+gallons+" gallons";

        if (quartsNeeded%QUARTS_IN_GALLON==0){
            messageString += ".";
        } else if(quartsNeeded%QUARTS_IN_GALLON==1){
            messageString += " plus "+quartsNeeded%QUARTS_IN_GALLON+" quart.";
        }else{
            messageString += " plus "+quartsNeeded%QUARTS_IN_GALLON+" quarts.";
        }

        System.out.println(messageString);
    }
    public static void main(String[] args) {
        quartsToGallons(18);
    }

}