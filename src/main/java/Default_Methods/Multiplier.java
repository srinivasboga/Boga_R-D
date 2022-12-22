package Default_Methods;

import java.util.List;

interface Multiplier {
	
	
	int multiply(List<Integer> list);
	
	default int size(List<Integer> list) {
		System.out.println("Inside Multiplier:. ");
		return list.size();
	}
	
	static Boolean isEmpty(List<Integer> list) {
		System.out.println("Inside the multiplier interface: ");
		return list!=null&&list.size()>0;
	}

}
