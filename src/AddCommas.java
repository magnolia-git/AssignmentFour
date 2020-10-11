import acm.program.ConsoleProgram;
public class AddCommas extends ConsoleProgram {
	
	public void run() {
		while (true) {
			
			String digits = readLine("Enter a string of numbers: ");
			if (digits.length() == 0) break;	// Stops the program. Won't close it out, though.
			println(addCommasToNumericString(digits));
		}
	}
	/*	The addCommasToNumericString method will run for as long as the length of str.
	 * 	str is digits since it was passed as the argument.
	 */	
	private static String addCommasToNumericString(String str) {
		
		String newString = "";		// Empty string to store the new set of numbers.
		for (int i = 1; i <= str.length(); i++) {	

			newString = str.substring(str.length() - i, str.length() - i + 1) + newString;
			// gets the substring of the last number in str into newString, then adds what is already in newString.
			if (i % 3 == 0 && i != str.length()) {
					
				newString = "," + newString;
				// Adds the comma as long as i has no remainder when divided by 3 and isn't the same as str's length
			}
		}
		return newString;
	}
}