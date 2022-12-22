package StreamTerminalOperations;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import streamOperation.Student;
import streamOperation.StudentDataBase;

public class groupingMaxMinCollectingAndThen {

	
	
	public static void calculateGpa() {
		
		Map<Integer, Student> stuMapOpt = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa))
								,Optional::get)));
		
		System.out.println(stuMapOpt);
	}
	
	public static void calculateLeastGpa() {
		Map<Integer, Student> studOp = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)),
								Optional::get)));
		
		System.out.println(studOp);
	}
	
	public static void main(String[] args) {

		calculateLeastGpa();
		calculateGpa();
		
	}

}
