import java.util.Arrays;
public class Alphabetize{
	public static void main(String[] args) {
		String[] order = {"first", "second", "third"};
		String[] words0 = {"Mars", "Earth", "Jupiter"};
		String[] words1 = {"Earth", "Jupiter", "Mars"};
		
		alphabetizeCheck(words0);
		alphabetizeCheck(words1);
		
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
		
}