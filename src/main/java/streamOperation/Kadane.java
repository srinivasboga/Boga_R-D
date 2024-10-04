package streamOperation;

public class Kadane {
   
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0; 
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Kadane k = new Kadane();
        
        // Test case 1
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum1 = k.maxSubArray(nums1);
        System.out.println("Test Case 1: Maximum subarray sum is: " + maxSum1 + ""); // Expected output: 6

        // Test case 2: Single element array
        int[] nums2 = {1};
        int maxSum2 = k.maxSubArray(nums2);
        System.out.println("Test Case 2: Maximum subarray sum is: " + maxSum2 + " "); // Expected output: 1

        // Test case 3: All negative numbers
        int[] nums3 = {-1, -2, -3, -4};
        int maxSum3 = k.maxSubArray(nums3);
        System.out.println("Test Case 3: Maximum subarray sum is: " + maxSum3 + " "); // Expected output: -1

        // Test case 4: Array with all positive numbers
        int[] nums4 = {2, 3, 4, 5};
        int maxSum4 = k.maxSubArray(nums4);
        System.out.println("Test Case 4: Maximum subarray sum is: " + maxSum4 + " "); // Expected output: 14

        // Test case 5: Mixed positive and negative numbers
        int[] nums5 = {-2, 5, -1, 3, -2, 4, -7};
        int maxSum5 = k.maxSubArray(nums5);
        System.out.println("Test Case 5: Maximum subarray sum is: " + maxSum5 + ""); // Expected output: 9

        // Test case 6: Empty array
        int[] nums6 = {};
        int maxSum6 = (nums6.length > 0) ? k.maxSubArray(nums6) : 0; // Handle empty array case
        System.out.println("Test Case 6: Maximum subarray sum is: " + maxSum6 + " "); // Expected output: 0

        // Test case 7: Array with a single negative number
        int[] nums7 = {-5};
        int maxSum7 = k.maxSubArray(nums7);
        System.out.println("Test Case 7: Maximum subarray sum is: " + maxSum7 + " "); // Expected output: -5
    }
}
