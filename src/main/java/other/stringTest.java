package other;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class stringTest {

	public static void main(String[] args) {
		String str = "programming";
		//char[] chars = str.toCharArray();
		Map<Character, Integer> map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.filter(entry -> entry.getValue() == 1)   // Filter out the characters that appear more than once
				.map(Map.Entry::getKey)                   // Get the non-repeating characters
				.collect(Collectors.toMap(c -> c, c -> 1, Integer::sum));
		
		System.out.println("\n Single time of occurrences of characters in a String:" + map);
		
		
		//number of occurrences of characters in a String
		Map<Character, Long> map1 = str.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println("\n Number of occurrences of characters in a String:" + map1);
		
	}
}
