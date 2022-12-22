package streamOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class streamReduce {

	public static int getRedu(List<Integer> integers) {
		
		return integers.stream()
				.reduce(1, (a,b) -> a*b);
				//1,2,3,4,5,6....
				//a=1, b=1(from stream) => result 1 is returned
				//a=1(result),b=2 (from stream) => result 2 is returned
				
	}
	
	
public static Optional<Integer> getRedu1(List<Integer> integers) {
		
		return integers.stream()
				.reduce((a,b) -> a*b);
				//1,2,3,4,5,6....
				//a=1, b=1(from stream) => result 1 is returned
				//a=1(result),b=2 (from stream) => result 2 is returned
				
	}

	public static Optional<Student> getHighestGPAStudent() {
		
		return StudentDataBase.getAllStudents()
				.stream()
				.reduce((s1,s2) -> (s1.getGpa()>s2.getGpa()) ? s1 : s2);
	}
	
	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> input = new ArrayList<>();
		
		System.out.println(getRedu(values));
		
		System.out.println(getRedu1(values).isPresent());
		
		Optional<Integer> result = getRedu1(input);
		
		System.out.println(result.isPresent());
		
		//System.out.println(result.get());
		
		Optional<Student> optionalStudent = getHighestGPAStudent();
		if(optionalStudent.isPresent())
			System.out.println(optionalStudent.get());
		
	}

}
