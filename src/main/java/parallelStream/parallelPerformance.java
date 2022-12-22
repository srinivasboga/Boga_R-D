package parallelStream;

import java.util.List;
import java.util.stream.Collectors;

import streamOperation.Student;
import streamOperation.StudentDataBase;

public class parallelPerformance {

	
	public static List<String> sequentialGetActDistinct() {
		
		Long startTime = System.currentTimeMillis();
		
		List<String> studis = StudentDataBase.getAllStudents().stream()   //Strema<Student>
				.map(Student::getActivities)    //Stream<List<String>>
				.flatMap(List::stream)   //Stream<String>
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		
		Long endTime = System.currentTimeMillis();
		System.out.println("Sequential Stream Complition Time: " +(endTime-startTime));
		
		return studis;
	}
	
	public static List<String> parallelGetActDistinct() {
		
		Long startTime = System.currentTimeMillis();
		
		List<String> studis = StudentDataBase.getAllStudents().parallelStream()   //Strema<Student>
				.map(Student::getActivities)    //Stream<List<String>>
				.flatMap(List::stream)   //Stream<String>
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		
		Long endTime = System.currentTimeMillis();
		
		System.out.println("Parallel Stream Complition Time: " +(endTime-startTime));
		
		return studis;
	}
	
	public static void main(String[] args) {

		sequentialGetActDistinct();
		parallelGetActDistinct();
		
	}

}
