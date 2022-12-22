package Default_Methods;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

	public static void main(String[] args) {

		Multiplier mul =new MultiplierImpl();
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		System.out.println("Result(Before Java 8) : "+mul.multiply(list));
		
		System.out.println("Default method: " +mul.size(list));
		
		System.out.println("Static Method: ");
		
		Multiplier.isEmpty(list);
		
		MultiplierImpl.isEmpty(list);
		
	}

}
