package other;

public class PrintLetters {
	public static void main(String[] args) {
		String s;
		
		// Use command-line argument if provided, otherwise use a default string
		if (args.length > 0) {
			s = args[0];
		} else {
			// Default string for testing purposes
			s = "a1b2c3d4e5f6g7h8i9j10k11l12m13n14o15p16q17r18s19t20u21v22w23x24y25z26";
		}
		
		// Check if the string is empty
		if (s.isEmpty()) {
			System.out.println("Invalid input: string is empty");
			return;
		}
		
		// Check if the first character is a digit
		if (Character.isDigit(s.charAt(0))) {
			System.out.println("Invalid input: string should not start with a digit");
			return;
		}
		
		// Iterate through the string
		for (int i = 0; i < s.length(); i++) {
			// Check if the current character is a digit
			if (Character.isDigit(s.charAt(i))) {
				// To handle multi-digit numbers
				StringBuilder numberBuilder = new StringBuilder();
				while (i < s.length() && Character.isDigit(s.charAt(i))) {
					numberBuilder.append(s.charAt(i));
					i++;
				}
				
				// Ensure that a valid number was found
				if (!numberBuilder.isEmpty()) {
					int n = Integer.parseInt(numberBuilder.toString()); // Convert to integer
					char letter = s.charAt(i - numberBuilder.length() - 1); // Get the preceding letter
					
					// Print the letter 'n' times
					for (int j = 0; j < n; j++) {
						System.out.print(letter);
					}
				}
				// Adjust index since we have already incremented it in the inner loop
				i--;
			}
		}
		
		System.out.println(); // Print a new line after the output
	}
}
