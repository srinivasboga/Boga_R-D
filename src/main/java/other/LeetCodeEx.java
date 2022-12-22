package other;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class LeetCodeEx {

	public static void main(String[] args) {
		int[] i = {1,1,1,2,2,3};
		//int[] arr1 = topKFrequent(i,2);
		int[] ss = topKFrequent(i,2);
		System.out.println(ss);
	}

	public static int[] topKFrequent(int[] nums, int k) {
		
		
		List<int[]> list = Arrays.asList(nums);
		
		//System.out.println(list.get(1));
		
		int[] arr={10,20,30,40,50,60,70,80,90,100,110};
        
		Arrays.sort(arr);
		System.out.println(arr);
		for(int num: arr) {
			System.out.print(num+" ");
		}
		/*//int n = arr.length/2;
		*/System.out.println(arr.length);
		int[] temp = arr.clone();
		//int m = 1==1?System.out.print(arr[arr.length]):System.out.print(arr[n-1]);
		long m = arr.length-1;
		//int j =0;
		
		long[] brr = new long[arr.length];
		
		
		String a = "Boga";
        String b = new String("Boga");
        b = "Boga2";
        String name = "Boga";
        add(name);
        System.out.println(a+" "+b+" "+add(name));
    
    
    
		/*
		 * for(int i = 0,j=m;(i!=j);i++,j--) { brr[j] = arr[i];
		 * System.out.print(arr[j]+" "+arr[i]+" "); }
		 */
		 
		
	      
		
		if(arr.length/2!=0)
			System.out.println(arr[(arr.length/2)]);
		
			/*
			 * for(int i = m;i>n;i--) {
			 * 
			 * System.out.print(arr[i]+" "); for(int i1 = j; i1<=n;) {
			 * 
			 * System.out.print(arr[i1]+" "); if((i1==n)&&((arr.length)%2!=0)) {
			 * System.out.println(arr[i1+1]); } break; } j=j+1; }
			 */
		/*
		 * int[] arr = new int[nums.length];
		 * 
		 * for(int i=0;i<nums.length;i++) {
		 * 
		 * int value = 0; for(int j =0;j<nums.length;j++) {
		 * 
		 * if(nums[i] == nums[j]) { if(value==k) { arr[i] = nums[i];
		 * System.out.println(arr[i]+" "+k+" "+value); } } value++; }
		 * 
		 * }
		 */
		
		return null;
		
		//List<Integer> list = Arrays.asList(nums);
     
		//List<int[]> ll = list.stream().filter(e->(list.contains(e)>k)).toList();

		//System.out.println("Duplicate Elements from List: "+ll);

			
		
		/*
		 * List<int[]> arr1 = list.stream().filter(e ->
		 * Collections.frequency(list,e)>k).toList(); // .collect(Collectors.toArray());
		 * 
		 * int[] array = new int[arr1.size()]; for(int i = 0; i < list.size(); i++)
		 * {array[i] = arr1.get(i);}
		 * 
		 * 
		 * return arr[arr1];
		 */
	}
	
	public static String add(String name) {
        name = "Srinivas";
        return name;
    }
		

}
