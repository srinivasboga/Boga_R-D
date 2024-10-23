package functional;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StringCount {
	public static void main(String[] args) {
		String str = "Fear leads to anger; anger leads to hatred; hatred leads to conflict, conflict leads to suffering.";
		
		String[] str1 = str.split("[;,. ]");
		
		Map<String, Long> map = method(str1);
		
		map.forEach((s, e) -> System.out.println(s+" : "+e));
	}
	
	private static Map<String, Long> method(String[] str1) {
		return Arrays.stream(str1)
				.collect(Collectors.groupingBy(e->e, Collectors.counting()));
	}
}
