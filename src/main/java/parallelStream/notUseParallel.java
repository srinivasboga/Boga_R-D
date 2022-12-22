package parallelStream;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class notUseParallel {

	
	public static String sequentialSum(List<Integer> list) {
		
		Long startTime = System.currentTimeMillis();
		int sum  = list.stream().reduce(0,(x,y)->x+y);
		
		Long endTime = System.currentTimeMillis() - startTime;
		
		return "Sequential Stream Execution Time: "+endTime;
	}
	
	public static String parallelSum(List<Integer> list) {
		
		Long s = System.currentTimeMillis();
		
		int sum  = list.stream().parallel().reduce(0,(x,y)->x+y);
		
		Long duration = System.currentTimeMillis() - s ;
		
		return "Parallel Stream Execution Time: "+duration;
	}
	
	public static void main(String[] args) {
			
		List<Integer> list = IntStream.rangeClosed(1, 10000)
								.boxed()
								.toList();
		
		System.out.println(sequentialSum(list));
		System.out.println(parallelSum(list));
		
	}

}
