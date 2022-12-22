package StreamTerminalOperations;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import streamOperation.Student;
import streamOperation.StudentDataBase;

public class partitioning {

	
	public static void partitioningBy() {
		
		Predicate<Student> getGpa = student -> student.getGpa() >= 3.8;
		
		Map<Boolean, List<Student>> partionBy = StudentDataBase.getAllStudents().stream()
										.collect(Collectors.partitioningBy(getGpa));
		
		System.out.println(partionBy);
	}
	
	public static void partioningBy2() {
		
		Predicate<Student> getGpa = student -> student.getGpa() >= 3.8 ;
		
		Map<Boolean, Set<Student>> partioningBy = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.partitioningBy(getGpa, Collectors.toSet()));
		
				
		System.out.println(partioningBy);
		
		partioningBy.values().forEach(System.out::println);

	}
	
	public static void main(String[] args) {

		
		partitioningBy();
		partioningBy2();
		
	}

}
