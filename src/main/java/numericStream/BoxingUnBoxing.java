package numericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnBoxing {

	
	public static List<Integer> boxing() {
		
		return IntStream.rangeClosed(1,10)
				.boxed()
				.collect(Collectors.toList());
	}
	
	public static int unBoxing(List<Integer> list) {
		return list.stream()
				.mapToInt(Integer::intValue)
				.sum();
	}
	
	public static void main(String[] args) {
		
		System.out.println(boxing());
		
		System.out.println("Sum of: "+unBoxing(boxing()));
	}

}
