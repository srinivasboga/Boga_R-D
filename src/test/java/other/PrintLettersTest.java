package other;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintLettersTest {
	
	@Test
	public void testPrintLetters() {
		// Arrange
		String input = "a1b2c3";
		String expectedOutput = "abbcc";
		
		// Redirect System.out to capture output
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outputStream));
		
		// Act
		PrintLetters.main(new String[] { input });
		
		// Restore original System.out
		System.setOut(originalOut);
		
		// Assert
		String actualOutput = outputStream.toString().trim();
		assertEquals(expectedOutput, actualOutput, "The output should match the expected output.");
	}
	
	@Test
	public void testEmptyString() {
		// Arrange
		String input = "";
		String expectedOutput = "Invalid input: string is empty";
		
		// Redirect System.out to capture output
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outputStream));
		
		// Act
		PrintLetters.main(new String[] { input });
		
		// Restore original System.out
		System.setOut(originalOut);
		
		// Assert
		String actualOutput = outputStream.toString().trim();
		assertEquals(expectedOutput, actualOutput, "The output should indicate the string is empty.");
	}
	
	@Test
	public void testStartsWithDigit() {
		// Arrange
		String input = "1a2b";
		String expectedOutput = "Invalid input: string should not start with a digit";
		
		// Redirect System.out to capture output
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outputStream));
		
		// Act
		PrintLetters.main(new String[] { input });
		
		// Restore original System.out
		System.setOut(originalOut);
		
		// Assert
		String actualOutput = outputStream.toString().trim();
		assertEquals(expectedOutput, actualOutput, "The output should indicate invalid input.");
	}
}
