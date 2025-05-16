package other;

import java.util.Arrays;
import java.util.List;

public class StringLengthCount {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
		int count = list.stream()
				.filter(e -> e.length() > 5)
				.mapToInt(String::length)
				.sum();
		
		System.out.println(count);
	}
}
