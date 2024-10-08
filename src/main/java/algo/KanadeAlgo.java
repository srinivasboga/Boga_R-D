package algo;

public class KanadeAlgo {
	
	public static void main(String[] args) {
		int[] arr = {2,3,1,3,2,4,6,7,9,2,19};
		
		System.out.println(maxSubArray(arr));
	}
	
	static int maxSubArray(int[] arr) {
		int start = arr[0];
		int end = arr[0];
		for ( int i = 1; i < arr.length; i++) {
			end = Math.max(arr[i], arr[i] + end);
			start = Math.max(start, end);
		}
		return start;
	}
}
