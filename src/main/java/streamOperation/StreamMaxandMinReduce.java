package streamOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxandMinReduce {

	public static int getMax(List<Integer> list) {
		
		return list.stream()
				.reduce(0, (x,y)->(x>y)? x : y);
				
	}
	
	public static Optional<Integer> getValue(List<Integer> list) {
		
		return list.stream()
				.reduce((x,y)->(x>y)?x:y);
	}
	
	public static int findMin(List<Integer> intList) {
		
		return intList.stream()
				.reduce(0, (x,y)->x<y?x:y);
	}
	
	public static Optional<Integer> findMini(List<Integer> intList) {
		
		return intList.stream()
				.reduce((x,y)->x<y?x:y);
		
	}
	
	public static void main(String[] args) {
		
		List<Integer> listMax = Arrays.asList(22,44,77,88,60,4,48,67,93,100);
		System.out.println(getMax(listMax));
		
		List<Integer> listEmpty = new ArrayList<>();
		
		Optional<Integer> maxVal = getValue(listEmpty);
		//System.out.println("Optional Empty return: "+maxVal.get());
		
		if(maxVal.isPresent()) {
			System.out.println(maxVal.get());
		} else {
			System.out.println("Input is empty.");
		}
		
		System.out.println("------------------------------------------");
		
		System.out.println(findMin(listMax));
		
		//System.out.println("Minimum Value from the list is: "+findMini(listMax));
		
		if(findMini(listMax).isPresent()) {
			System.out.println("Minimum Value from the list is: "+findMini(listMax).get());
		}else {
			System.out.println("Values not allowed.");
		}
	}

}
