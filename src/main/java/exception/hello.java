package exception;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class hello {

	public static void main(String[] args) {
		
		/*Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

		Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
		Example 1:

		Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
		Output: [2,2,2,1,4,3,3,9,6,7,19]
		Example 2:

		2,2,2,1,4,3,3,9,6,7,19
		2,3,1,3,2,4,6,7,9,2,19

		Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
		Output: [22,28,8,6,17,44]*/
		
		int arr1[] = {2,3,1,3,2,4,6,7,9,2,19};
		
		int arr2[] = {2,1,4,3,9,6};
		
		int arr3[] = new int[arr1.length];
		
		int t =0;
		//boolean count  = false;
		for(int i = 0; i<arr2.length;i++) {
			
			for(int j = 0;j<arr1.length;j++) {
				
				if(arr2[i]==arr1[j]) {									//2,1,4,3,9,6
					arr3[t] = arr1[j];
					System.out.print(arr3[t]+" ");						//2,2,2,1,4,3,3,9,6,7,19
					t++;
				} /*
					 * else if(arr3[t+1]!=arr1[j]&&count) {
					 * 
					 * arr3[t+1]=arr1[j]; System.out.print(arr3[t+1]);
					 * 
					 * }
					 */
				
				
			}
			//count = false;
		}
		System.out.println("\n");
		for(int i=0;i<arr1.length;i++) 
			System.out.print(" "+arr3[i]);
		
		
		
		//Arrays.sort(arr3); Arrays.sort(arr1);
		
		
		/*
		 * 
		 * 
		 * for(int i=0;i<arr1.length;i++) System.out.print(arr1[i]+" "+arr3[i]);
		 */	
		/*
		 * for(int i=0;i<arr1.length;i++) { // System.out.println(arr3[i]+" "+arr1[i]);
		 * if(arr1[i]!=arr3[i]) System.out.print(arr1[i]+" "); }
		 * 
		 * 
		 * 
		 * //while(arr2.length<arr1.length)
		 * 
		 * for(int i=1;arr2.length+i<=arr2.length;i++) {
		 * System.out.println(arr1[arr2.length+i]); }
		 */
		
		
		/*
		 * hello a = new hello();
		 * 
		 * System.out.println(a);
		 */
		
	}
	/*
	 * private static List<Integer> toList(int[] arr1) { List<Integer> list = new
	 * ArrayList<>(); for(int i:arr1) list.add(i); return list; }
	 * 
	 * private static TreeSet<Integer> toSet(int[] arr1) { TreeSet<Integer> s = new
	 * TreeSet<>(); for(int i:arr1) s.add(i); return s; }
	 */

}
