package other;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class findRepeatedEle {

	/*
	 * public static <T> Set<T> find(List<T> list) { Set<T> items = new
	 * HashSet<T>();
	 * 
	 * return list.stream() .filter(e-> !items.add(e)) .collect(Collectors.toSet());
	 * }
	 */
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,2,2,3,1,4,4,44,5,6,7,8,8,9,9,0);
		
		/*
		 * List<Integer> l1 = list.stream() .reduce(e->list.equals(e))
		 * .filter(list.contains(list.e)>1) .toList();
		 */
		Collections.sort(list);
		System.out.println(list);
		Set<Integer> set = find(list);
		
		System.out.println(set);
		System.out.println(set.size());		
		List<String> l = Arrays.asList("Srinivas","Gopal", "boga", "boga");
        Set<String> str = findDup(l);
        
        System.out.println("Find Duplicate Strings: "+str);
        
        Set<Integer> ll = list.stream().filter(i -> Collections.frequency(list, i) > 1)
                .collect(Collectors.toSet());
        System.out.println("Find Duplicate Integers : "+ll);
        
        List<String> l1 = Arrays.asList("Srinivas","Gopal","Boga");
		List<String> l2 = Arrays.asList("Ramesh","Gopal","Boga");
		
		List<String> str1 = l1.stream()
								.filter(e -> l2.contains(e))
								.toList();
		
		System.out.println(str1);
		
		
	}

	private static Set<String> findDup(List<String> l) {
		Set<String> s = new HashSet<String>();
		return l.stream().filter(e->!s.add(e)).collect(Collectors.toSet());
	}

	private static Set<Integer> find(List<Integer> list) {
		Set<Integer> set = new HashSet<Integer>();
		return list.stream().filter(e->!set.add(e)).collect(Collectors.toSet());
	}

}
