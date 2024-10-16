package other;

public class printLettersAsprecedingNoOfTimes {
	
	public static void main(String[] args) {
		String input = "a6b9c9";
		String output = expandString(input);
		System.out.println(output);
	}
	
	public static String expandString(String input) {
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < input.length(); i++) {
			char letter = input.charAt(i);
			i++; // Move to the number
			int count = Character.getNumericValue(input.charAt(i)); // Get the numeric value
			
			// Append the letter 'count' times
			for (int j = 0; j < count; j++) {
				result.append(letter);
			}
		}
		
		return result.toString();
	}
}
