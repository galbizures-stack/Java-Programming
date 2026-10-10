import java.util.Scanner;
public class CountSpaces2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter inspirational quote >> ");
		String inspoQuote = input.nextLine();
		
		int whitespaceCounter=0;
		for(int i=0; i<inspoQuote.length(); i++) {
			char indexedChar = inspoQuote.charAt(i);
			if(indexedChar==' ') {
				whitespaceCounter++;
			}//if	
		}//for loop
		System.out.println("The number of spaces is "+whitespaceCounter);		
		
		input.close();
	}
}