package Default_Methods;

import java.util.List;

public class MultiplierImpl implements Multiplier{

	@Override
	public int multiply(List<Integer> list) {
		
		return list.stream()
				.reduce(1,(x,y)-> x*y);
	}
	
	public int size(List<Integer> list) {
		System.out.println("Inside MultiplierImpl class: ");
		return list.size();
	}
	
	static Boolean isEmpty(List<Integer> list) {
		System.out.println("Inside the MultiplierImpl calss: considering this static method as another method..");
		return list!=null&&list.size()>=0;
	}

}
