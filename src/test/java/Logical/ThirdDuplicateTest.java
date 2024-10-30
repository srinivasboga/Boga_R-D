package Logical;

import Logical.ThirdDuplicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ThirdDuplicateTest {
	
	@Test
	public void testThirdDuplicateFound() {
		int[] arr = {3, 4, 5, 6, 1, 3, 4, 9, 0, 3, 4, 3, 3, 9};
		Integer expected = 9; // The third duplicate
		Integer result = ThirdDuplicate.getThirdDuplicate(arr);
		Assertions.assertEquals(expected, result);
	}
	
	@Test
	public void testLessThanThreeDuplicates() {
		int[] arr = {1, 2, 3, 4, 5}; // No duplicates
		Integer result = ThirdDuplicate.getThirdDuplicate(arr);
		assertNull(result);
	}
	
	@Test
	public void testExactlyThreeDuplicates() {
		int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5}; // Three duplicates: 1, 2, 3
		Integer expected = 3;
		Integer result = ThirdDuplicate.getThirdDuplicate(arr);
		Assertions.assertEquals(expected, result);
	}
	
	@Test
	public void testDuplicatesWithZeros() {
		int[] arr = {0, 0, 0, 1, 2, 3, 4, 0}; // The first duplicate is 0
		Integer expected = 0;
		Integer result = ThirdDuplicate.getThirdDuplicate(arr);
		Assertions.assertEquals(expected, result);
	}
	
	@Test
	public void testAllDuplicates() {
		int[] arr = {1, 1, 1, 2, 2, 2}; // All duplicates are present
		Integer expected = 2; // The third duplicate
		Integer result = ThirdDuplicate.getThirdDuplicate(arr);
		Assertions.assertEquals(expected, result);
	}
}
