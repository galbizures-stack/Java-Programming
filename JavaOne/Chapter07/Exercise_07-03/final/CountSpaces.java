public class CountSpaces{
	public static void main(String[] args) {		
		
		String inspoQuote = "Fuck Bitches Make Money!";
		System.out.println(inspoQuote);
		
		int whitespaceCounter=0;
		//System.out.println(inspoQuote.length());
		
		for(int i=0; i<inspoQuote.length(); i++) {
			char indexedChar = inspoQuote.charAt(i);
			if(indexedChar==' ') {
				whitespaceCounter++;
			}//if	
		}//for loop
		
		System.out.println("The number of spaces is "+whitespaceCounter);
	}
}