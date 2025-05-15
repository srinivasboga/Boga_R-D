package other;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeaterStr {

	public  static void main(String[] args) {
		
		String str = "Non Repeating Character";
		
		Map<Character, Integer> map = new HashMap<>();
		
		Queue<Character> que = new LinkedList<>();
		
		/*for(char ch: str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch,0)+1);
			que.offer(ch);
			
			while(!que.isEmpty() && map.get(que.peek())>1) {
				que.poll();
			}
			
			if(!que.isEmpty()) {
				System.out.println(que.peek());
			}
		}*/
		
		
		Optional<Character> nonRe = str.toLowerCase().chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(
						Function.identity(), LinkedHashMap::new, Collectors.counting()
				))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() == 1)
				.map(Map.Entry::getKey)
				.findFirst();
		
		nonRe.ifPresent(System.out::println);
		
		
	}
	
}
