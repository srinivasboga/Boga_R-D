package StreamTerminalOperations;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import streamOperation.Student;
import streamOperation.StudentDataBase;

public class groupingThree {

	public static void groupByThree() {
		
		Map<String, List<Student>> studentThreeGroup = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName,
						LinkedHashMap :: new,
						Collectors.toList()));
		
		System.out.println(studentThreeGroup);
	}
	
	
	public static void main(String[] args) {

		groupByThree();
		
	}

}
