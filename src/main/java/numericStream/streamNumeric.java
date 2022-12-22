package numericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class streamNumeric {

	public static int IntNum(List<Integer> list) {
		
		return list.stream().reduce(0, (x,y)->x+y);
	}
	
	//IntNumeric Stream
	
	public static int InitNumStr() {
		return IntStream.rangeClosed(0,9)
				//1
				//2
				//3
				//4
				//5
				.sum();
	}
	
	public static void main(String[] args) {
		
		//List<Integer> values = Arrays.asList(1,2,3,4.5,6,7,8);
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		System.out.println(IntNum(values));
		
		System.out.println(InitNumStr());
		
	}

}
