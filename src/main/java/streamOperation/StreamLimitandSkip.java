package streamOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitandSkip {

	public static Optional<Integer> limitOp(List<Integer> intList) {
		
		return intList.stream()
				.limit(4)
				.reduce((x,y)->x+y);
				
	}
	
	public static Optional<Integer> skipOp(List<Integer> intList) {
		
		return intList.stream()
				.skip(4)
				.reduce((x,y)->x+y);
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(4,5,6,77,88,90);
		
		Optional<Integer> limit = limitOp(list);
		
		if(limit.isPresent()) {
			System.out.println("Sum of Limited values:" +limit.get());
		} else {
			System.out.println("Values are empty");
		}
		
		Optional<Integer> skip = skipOp(list);
		
		if(skip.isPresent()) {
			System.out.println("Sum of after the skipping values are: " +skip.get());
		} else {
			System.out.println("List is empty.");
		}
		
		
		
			
	}

}
