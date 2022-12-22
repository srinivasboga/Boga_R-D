package role;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test {

	public static void main(String[] args) {
		
	String as = "Im an Indian";
	List<String> list = Arrays.asList(as.replace(" ", "").toLowerCase());
	
	
	System.out.println(System.currentTimeMillis());
	Map<Character, Long> collect = list.parallelStream()
											.flatMap(a->a.chars().mapToObj(c-> (char) c))
											.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
	System.out.println(collect.keySet()+"\n"+collect.values());
	
	System.out.println(System.currentTimeMillis());
	
	
	System.out.println(System.currentTimeMillis());
	Map<Character, Long> collect1 = list.stream()
										.flatMap(a->a.chars().mapToObj(c-> (char) c))
										.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
	System.out.println(collect1.keySet()+"\n"+collect1.values());
	
	System.out.println(System.currentTimeMillis());
	
	
	/*if(map1.containsKey(c)) {
				int cnt= map1.get(c);
				map1.put(c, ++cnt);
			} else {
				map1.put(c,1);
			}*/
	// l = as.chars().filter(e-> e==a).count();
	
	}

}
