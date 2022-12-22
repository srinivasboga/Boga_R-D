package functional;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NexTurn {

	public static void main(String[] args) {
		String name ="Srinivas".toLowerCase();
		
		char[] a = name.toLowerCase().toCharArray();
		
		Map<Character, Integer> map =new  HashMap<Character, Integer>();
		System.out.println("============Method 1============");
		
		System.out.println(System.currentTimeMillis());
		for(int j =0; j<name.length(); j++) {
		
			int t = 0;
			for(int i = 0;i<name.length();i++) {
				if(a[j] == a[i] ) {
					t++;
				}
			}
			map.put(a[j], t);
		}
		System.out.println(map.keySet()+"\n"+map.values());
		System.out.println(System.currentTimeMillis());
		
		/*
		 * for(Character c: map.keySet()) { System.out.println(c+" "+map.get(c)); }
		 */
		System.out.println("============Method 2============");
		
		System.out.println(System.currentTimeMillis());
		Map<Character, Integer> map1 =new HashMap<Character, Integer>();
		
		for(int i =0;i<name.length();i++) {
			
			char c= name.charAt(i);
			if(map1.containsKey(c)) {
				int cnt= map1.get(c);
				map1.put(c, ++cnt);
			} else {
				map1.put(c,1);
			}
		}
		
		
		System.out.println(map1.keySet()+"\n"+map1.values());
		/*
		 * for(Character c: map1.keySet()) { System.out.println(c+" "+map1.get(c)); }
		 */
		System.out.println(System.currentTimeMillis());
		
		System.out.println("============Method 3(List of Strings)============");
		System.out.println(System.currentTimeMillis());
		
		String as = "Im an Indian";
	
		
		List<String> list = Arrays.asList(as.replace(" ", "").toLowerCase());
		
		System.out.println("---------->Sorting literals in a string-----");
		String str = as.replace(" ","").toLowerCase();
		char[] str1 = str.toCharArray();
		Arrays.sort(str1);
		System.out.println(str1);
		
		Map<Character, Long> collect = list.stream()
				.flatMap(n->n.chars().mapToObj(c-> (char) c))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(collect.keySet()+"\n"+collect.values());

		System.out.println(System.currentTimeMillis());
		
		System.out.println("============Fibonacci Series Using Java 8============");
		
		Stream.iterate(new long[] { 1, 1 }, p -> new long[] { p[1], p[0] + p[1] })
	      .limit(10) 
	      .forEach(p -> System.out.print(p[0]+" "));
							
	}
}
