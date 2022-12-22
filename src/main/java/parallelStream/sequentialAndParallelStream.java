package parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class sequentialAndParallelStream {

	
	public static long performance(Supplier<Integer> supplier, int numOfMilliSec) {
		
		long startTime = System.currentTimeMillis();
		for(int i = 0; i<numOfMilliSec; i++) {
			supplier.get();
		}
		long endTime = System.currentTimeMillis();
		
		return endTime - startTime;
	}
	
	public static int sumSequentialStream() {
		return IntStream.rangeClosed(1, 10000)
				.sum();
	}
	
	public static int sumParallelStream() {
		
		return IntStream.rangeClosed(1, 10000)
				.parallel()
				.sum();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Sequential Stream: "+performance(sequentialAndParallelStream::sumSequentialStream, 20)+" Secs");
		System.out.println("Parallel Stream: "+performance(sequentialAndParallelStream::sumParallelStream, 20)+" Secs");
		

	}

}
