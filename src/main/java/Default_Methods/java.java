package Default_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class java {

	public static void main(String[] args) {
		
		int[] a = {1,2,6,2,7,3,7,4};

		int n = a.length;
		
		stop:
		for(int i = n-1;i>=0;i--) {
			int t =1;
			for(int j = 0;j<n;j++) {
				
				if((a[i]==a[j])) {
					if(t>1) {
						System.out.println(a[i]);
						break stop;
					}
					t++;
				}
			}
		}
		
		String test = "gee";
		String current = "g";
		System.out.print(test.indexOf(current)+" ");
		test = test.substring(test.indexOf(current)+1);
		
		System.out.print(test+" ");
		
		//for(int i =0;i<n;i++)
			//System.out.print(b[0]);
		
		/*
		 * for(int i=n-1;i>=0;i--) {
		 * 
		 * int c = a[i]; if(map.containsKey(c)) { int cnt = map.get(c); map.put(c,
		 * ++cnt); } else map.put(c, 1); } int n1 = map.size();
		 * System.out.println(map.size()); System.out.println(map.get(n1));
		 */
	}
}
