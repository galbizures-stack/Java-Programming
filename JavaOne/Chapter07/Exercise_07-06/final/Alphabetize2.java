import java.util.*;
public class Alphabetize2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] order = {"first", "second", "third"};
		String[] words0 = new String[3];
		
		for(int i=0; i<3; i++) {
			System.out.print("Enter "+order[i]+" string >> ");
			words0[i]=input.nextLine();
		}
		
		alphabetizeCheck(words0);
		alphabetizeMe(words0);
		
		input.close();
		
	}
	
	public static void alphabetizeCheck(String[] words) {
		boolean index0, index1, index2;
		String[] wordsCompare = words.clone();
		Arrays.sort(wordsCompare);
		if(words[0]==wordsCompare[0]) {
			index0=true;			
		}else {
			index0=false;
		}
		
		if(words[1]==wordsCompare[1]) {
			index1=true;			
		}else {
			index1=false;
		}
		
		if(words[2]==wordsCompare[2]) {
			index2=true;			
		}else {
			index2=false;
		}
		
		if(index0==true && index1==true && index2==true) {
			System.out.println("Yes, the strings entered in alphabetical order.");
		}else {
			System.out.println("No, the strings entered are not in alphabetical order.");
		}
	}
	
	public static void alphabetizeMe(String[] words) {
		String[] alphabetize = words.clone();
		
		Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);
		
		for(int i=0; i<3; i++) {
			System.out.print(alphabetize[i]+" ");
		}
		System.out.println();
	}
		
}