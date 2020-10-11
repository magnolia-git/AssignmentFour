import acm.program.ConsoleProgram;
public class DeleteCharacters extends ConsoleProgram {
	/*
	 * This program takes a string and removes any occurrence of a user-specified
	 * character.
	 */
	public void run() {
		String uncutString = readLine("Type a sentence or two, please: ");
		String character = readLine("What character would you like to cut from your previous input? ");
		char charCut = character.charAt(0);
		println(removeAllOccurrences(uncutString, charCut));	
	}
	private String removeAllOccurrences(String str, char ch) {
		
		String cutString = "";
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) != ch) {
				
				cutString += str.charAt(i);
			}
		}
	return cutString;
	}
}