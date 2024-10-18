package functional;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringCount {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("example", "stream", "example", "test", "stream");
		
		Map<String, Long> stringCountMap = strings.stream()
				.collect(Collectors.groupingBy(s -> s, Collectors.counting())); // Count occurrences
		
		// If you want the result as Map<String, Integer>
		Map<String, Integer> integerCountMap = stringCountMap.entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().intValue()));
		
		System.out.println(integerCountMap);
	}
}
