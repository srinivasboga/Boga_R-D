package streamOperation;

import java.util.List;
import java.util.stream.Collectors;

public class StreamflatMap {

	
	public static List<String> getAct() {
		
		List<String> stulist = StudentDataBase.getAllStudents().stream()   //Strema<Student>
				.map(Student::getActivities)    //Stream<List<String>>
				.flatMap(List::stream)   //Stream<String>
				.collect(Collectors.toList());
		
		return stulist;
	}
	
	
	public static List<String> getActDistinct() {
		
		List<String> studis = StudentDataBase.getAllStudents().stream()   //Strema<Student>
				.map(Student::getActivities)    //Stream<List<String>>
				.flatMap(List::stream)   //Stream<String>
				.distinct()
				.collect(Collectors.toList());
		
		return studis;
	}
		
	public static Long getActCount() {
		
		Long stucou = StudentDataBase.getAllStudents().stream()   //Strema<Student>
				.map(Student::getActivities)    //Stream<List<String>>
				.flatMap(List::stream)   //Stream<String>
				.distinct()
				.count();
				//.collect(Collectors.toList());
		
		return stucou;
	}

	public static void main(String[] args) {
		
		System.out.println("Flat Map Changing from one form to another-" +getAct());
		System.out.println("Using Distinct -" +getActDistinct());
		
		System.out.println("Using Count -" +getActCount());
		
	}

}
