package other;

public class PrintLetters { // Define the class
	public static void main(String[] args) { // Main method
		String s = "a1b2c3d4e5f6g7h8i9j10k11l12m13n14o15p16q17r18s19t20u21v22w23x24y25z26";
		
		// Check if the first character is a digit
		if (Character.isDigit(s.charAt(0))) {
			System.out.println("Invalid input: string should not start with a digit");
		} else {
			// Iterate through the string
			for (int i = 0; i < s.length(); i++) {
				// To handle multi-digit numbers
				StringBuilder numberBuilder = new StringBuilder();
				while (i < s.length() && Character.isDigit(s.charAt(i))) {
					numberBuilder.append(s.charAt(i));
					i++;
				}
				int n = Integer.parseInt(numberBuilder.toString()); // Convert to integer
				char letter = s.charAt(i - numberBuilder.length() - 1); // Get the preceding letter
				
				// Print the letter 'n' times
				for (int j = 0; j < n; j++) {
					System.out.print(letter);
				}
				// Adjust index since we have already incremented it in the inner loop
				i--;
			}
		}
		System.out.println(); // Print a new line after the output
	}
}

