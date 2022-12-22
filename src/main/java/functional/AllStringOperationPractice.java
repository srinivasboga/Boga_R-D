package functional;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllStringOperationPractice {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("hi","now","hello");
		
		Stream<String> str= Stream.of("reek_First", "geek_2", "geek_3", "Geek_4", "Geek_Last");
		
		System.out.println("-----Java Stream .map capitalize first letter only-----");
		
		List<String> ll = list.stream().map(e-> (e.substring(0,1).toUpperCase()) + e.substring(1)).toList();
		
		List<String> ToUpp = str.map(e -> Character.toUpperCase(e.charAt(0)) + e.substring(1)).toList();
			
		//List<String> stream = str.map(e -> Character.toUpperCase(e.charAt(0)) + e.substring(1)).toList();
		
		//stream.parallelStream().map(System.out::print);
		
		System.out.println("capitalize first letter"+ll);
		
		System.out.println(ToUpp);
		
		System.out.println("-----Java Stream capitalize Second letter only-----");
		
		Optional<String> s1 = list.stream().reduce((a,b)->b);
		
		System.out.println("---------S"+s1.get());
		
		System.out.println(list.get(list.size()-1));
		
		System.out.println("==============Finding the duplicate ele's=============");

		List<Integer> l2 = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
		
		//List<Integer> dupList = l2.stream().distinct().toList();
									//.filter( e-> !list.contains(e)).distinct().toList();
		
		List<Integer> dupList1 = l2.stream()
									.filter(e -> Collections.frequency(l2, e)>1).distinct().toList();
		
		System.out.println("List of duplicated ele's:"+dupList1);
		
		Stream<Integer> dupList =l2.stream();
		
		 Set<Integer> dupSet = new HashSet<>();
		 
		 dupList.filter(e-> !dupSet.add(e)).collect(Collectors.toSet());
		 System.out.println(dupSet);
		  
		System.out.println("==========Count occurrence of a given character in a string===========");
		
		String str1 = "geeksForGeeks";
		char c1 = 'e';
		
		long n = str1.chars().filter(e-> e==c1).count();
		
		System.out.println(n);
		
		System.out.println("==========Reverse elements of a Parallel Stream ===========");
		
		List<Integer> rev = Arrays.asList(11, 22, 33, 44);
		
		int stm = rev.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
		
		//List<Integer> reee = stm.toList();
		System.out.println("Stm: "+stm);
		System.out.println("==========Counting the chars from String===========");
		
		String s = "Srinivas".toLowerCase();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i =0;i<s.length();i++)  {
			
			char c = s.charAt(i);
			if(map.containsKey(c)) {
				int cnt = map.get(c);
				map.put(c,++cnt);
			} else {
				map.put(c,1);
			}
		}
		
		System.out.println(map.keySet()+"\n"+map.values());
		
		/*
		 * for(Character c: map.keySet()) { System.out.println(c+" "+map.values()); }
		 */
		
		char c11='A';
		char c2='B';
		System.out.println(c11+c2);
		
	}

	
}
