package streamOperation;
import java.util.Arrays;
import java.util.OptionalInt;

public class find2ndHighestEleFromArray {
	
	public static void main(String[] args) {
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
		
		OptionalInt m = Arrays.stream(arr1)
				.sorted()
				.distinct()
				.skip(Math.max(0, Arrays.stream(arr1).distinct().count()-2))
				.findFirst();
		
		System.out.println(m);
	}
}
