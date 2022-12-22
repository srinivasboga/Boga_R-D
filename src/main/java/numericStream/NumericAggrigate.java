package numericStream;


import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericAggrigate {

	public static void main(String[] args) {

		int intStream = IntStream.rangeClosed(1, 50).sum();
		System.out.println(intStream);
		
		//OptionalInt optionalInt = IntStream.range(0, 50).max();
				
		//IntStream.range(0, 50).max();
		
		System.out.println(IntStream.rangeClosed(0, 70).max().getAsInt());
		
		System.out.println(LongStream.rangeClosed(1, 50).min().getAsLong());
		
		System.out.println(IntStream.rangeClosed(1, 50).asDoubleStream().average().getAsDouble());
	}

}
