package other;

import java.util.*;

public class SplitList {
	
	public static void main(String[] args) {
		// Split a list into chunks of given size
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int splitValue = 3;
		
		List<List<Integer>> result = new ArrayList<>();
		
		for (int i = 0; i < list1.size(); i += splitValue) {
			int end = Math.min(i + splitValue, list1.size());
			result.add(new ArrayList<>(list1.subList(i, end)));
		}
		
		System.out.println("Split List: " + result);
		
		// String to reversed characters (example logic correction)
		String ss = "abjjlsdsl";
		String reversed = new StringBuilder(ss).reverse().toString();
		System.out.println("Reversed String: " + reversed);
		
		// Frequency of characters in a string (case insensitive)
		String s = "Try programiz.pro".toLowerCase();
		Map<Character, Integer> map = new HashMap<>();
		
		for (char c : s.toCharArray()) {
			if (Character.isWhitespace(c)) continue; // skip spaces
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		System.out.println("Character Frequencies: " + map);
		
		// Find the character with maximum frequency
		Optional<Map.Entry<Character, Integer>> maxEntry =
				map.entrySet().stream().max(Map.Entry.comparingByValue());
		
		maxEntry.ifPresent(entry ->
				System.out.println("Max Occurring Character: '" + entry.getKey() + "' with count " + entry.getValue()));
	}
}
