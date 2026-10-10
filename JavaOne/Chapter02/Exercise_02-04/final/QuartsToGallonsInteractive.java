import java.util.Scanner;
public class QuartsToGallonsInteractive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter quarts needed >> ");
        int userInputQuarts = input.nextInt();

        QuartsToGallons myQtToGal = new QuartsToGallons();
        myQtToGal.quartsToGallons(userInputQuarts);
        input.close();
    }
}