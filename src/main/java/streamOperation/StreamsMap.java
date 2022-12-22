package streamOperation;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMap {

	
	public static List<String> getStudents() {
		
		
		List<String> studentList = StudentDataBase.getAllStudents().stream()
										.map(Student::getName)
										.collect(Collectors.toList());
		
		return studentList;
		
		/*
		 * return StudentDataBase.getAllStudents().stream() // Stream<Student>
		 * .map(Student::getName) // Stream<String> .collect(toList()); // List<String>
		 */	}
	
	public static void main(String[] args) {
		
		System.out.println(getStudents());
		
	}

}
