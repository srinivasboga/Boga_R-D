package Logical;

import java.util.LinkedHashMap;
import java.util.Map;

public class ThirdDuplicate {
	
	// Method to find the third duplicate
	public static Integer getThirdDuplicate(int[] arr) {
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		
		// Count occurrences of each number
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		
		int count = 0;
		// Find the third duplicate
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() >= 2) {
				count++;
				if (count == 3) {
					return entry.getKey(); // Return the third duplicate
				}
			}
		}
		
		return null; // Return null if there are less than three duplicates
	}
	
	// Main method to test the functionality
	public static void main(String[] args) {
		int[] arr = {3, 4, 5, 6, 1, 3, 4, 9, 0, 3, 4, 3, 3, 9};
		Integer output = getThirdDuplicate(arr);
		
		// Print the result
		if (output != null) {
			System.out.println("The third duplicate is: " + output);
		} else {
			System.out.println("Less than three duplicates found.");
		}
	}
}
