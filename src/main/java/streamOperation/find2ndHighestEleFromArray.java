package streamOperation;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.*;

public class find2ndHighestEleFromArray {
	
	public static void main(String[] args) {
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
		List<Integer> num = Arrays.asList(3, 2, 1, 3, 2, 4, 6, 7, 9, 2, 19);
		OptionalInt m = Arrays.stream(arr1)
				.sorted()
				.distinct()
				.skip(Math.max(0, Arrays.stream(arr1).distinct().count()-2))
				.findFirst();
		
		int n  = num.stream()
						.sorted(reverseOrder())
						.distinct()
								.skip(1)
										.findFirst().get();
		
		int secondLargestNumber = num
				.stream()
				.sorted(Comparator.reverseOrder())
				//.limit(2)
				.skip(1)
				.findFirst()
				.get();
		
		
		System.out.println(m.getAsInt() + " " + n+ " " + secondLargestNumber);
	}
}
