package other;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class filterElements {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(0,2,2,3,1,4,4,44,5,6,7,8,8,9,9,0);
		
		List<String> l1 = Arrays.asList("Boga","Gopal","Srinivas");
		List<String> l2 = Arrays.asList("Ramesh","Gopal","Boga");
		Collections.sort(list);
		System.out.println("==========================");
		System.out.println("Sorted List: "+list);

		Set<Integer> str =  list.stream()
							.filter(e -> Collections.frequency(list, e)>1)
							.collect(Collectors.toSet());	
		
		
		System.out.println("Duplicate Elements from List using Cfrequency: "+str);
		
		System.out.println("==========================");
		
		List<String> t = l1.stream().filter(e->!l2.contains(e)).distinct().toList();
		System.out.println("Distinct Elements from List1: "+t);
		
		List<String> ll = l1.stream().filter(e->l2.contains(e)).toList();

		System.out.println("Duplicate Elements from List: "+ll);


		
		System.out.println("==========================");
		
		Set<String> str1 = l1.stream().filter(e->l2.contains(e)).collect(Collectors.toSet());

		System.out.println("Duplicate Strings: "+str1);
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put(null, 100);
		map.put(null, 200);
		map.put(null, 10000000);
		System.out.println(map.get(null));
		
		//print the odd ele's from the list
		List<Integer> l22 = list.stream().filter(i->!(i%2==0)).toList(); 
		System.out.println("Odd List: "+l22);
				
	}

	

}
