package numericStream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * @author  BOGA SRINIVAS
 *
 */
public class NumericStreamRangeExam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		IntStream initStream = IntStream.range(1, 50);
		
		System.out.println("Range is:  " +initStream.count());
		
		IntStream.rangeClosed(1, 50).forEach(System.out::print);
		
		System.out.println();
		
		IntStream.range(1, 50).forEach(value -> System.out.print(value+" "));
		
		System.out.println();
		
		LongStream.range(0, 90).forEach(value -> System.out.print(value+" "));
		
		System.out.println();
		
		IntStream.range(1, 10).asDoubleStream().forEach( t -> System.out.print(t+" "));
		
		System.out.println();
		
		DoubleStream.of(1.0,2.0,3.0).forEach(System.out::println);
		
	}

}
