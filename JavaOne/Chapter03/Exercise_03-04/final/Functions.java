public class Functions {

    public Functions(){
        //empty
    }

    static void percentageOfGivenValues(double num1, double num2){
        System.out.println(num1+" "+computePercent(num1,num2)
        +" percent of "+num2);
    }

    static double computePercent(double num1, double num2){
        return (num1/num2)*100;
    }
}