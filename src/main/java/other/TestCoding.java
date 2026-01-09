package other;

import java.util.HashMap;
import java.util.Map;

public class TestCoding {
	
	public static int[] findTwoSum(int[] nums, int target) {
		
		int n = nums.length;
		
		for(int i = 0; i<n-2;i++) {
			int current = nums[i];
			int newTarget = target - current;
			
			Map<Integer, Integer> numIndex = new HashMap<>();
			
			for ( int j = i+1; i < nums.length; i++ ) {
				int comp = newTarget - nums[j];
				if ( numIndex.containsKey(comp) ) {
					return new int[]{numIndex.get(comp), j};
				}
				numIndex.put(nums[i], i);
			}
		}
		return nums;
	}
	
	
	public static void main(String[] args) {
	/*Input: nums = [2,11,7,15],
	target = 9
	Output: [0,2]*/
	
	int[] input = {2, 11, 7, 15};
	
	int target = 9;
	
	int[] output = findTwoSum(input, target);
	
	System.out.println(output[0] + " "+output[1]);
	}
}
