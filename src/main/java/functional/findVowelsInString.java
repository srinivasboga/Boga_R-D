package functional;

import java.util.Arrays;
import java.util.stream.IntStream;

public class findVowelsInString {

	public static void main(String[] args) {

		String str = "Hello World";
		findVowels(str);
		char[] ch = str.toCharArray();
		findVowelsUsingMaptoObj(ch);
	}
	
	private static void findVowelsUsingMaptoObj(char[] ch) {
		IntStream.range(0,ch.length)
				.mapToObj(e -> ch[e])
				.filter( e -> Arrays.asList('a','e','i','o','u').contains(e))
				.forEach(System.out::println);
	}
	
	private static void findVowels(String str) {
		str.chars()
				.mapToObj(e -> (char) e)
				.filter( e -> Arrays.asList('a','e','i','o','u').contains(e))
				.forEach(System.out::print);
	}
	
}
