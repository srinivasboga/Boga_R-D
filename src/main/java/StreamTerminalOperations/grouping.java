package StreamTerminalOperations;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import streamOperation.Student;
import streamOperation.StudentDataBase;

public class grouping {

	public static void group() {
		
		Map<String, List<Student>> mapGroup = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender));
		
		System.out.println(mapGroup);
	}
	
	public static void customizedGroup() {
		
		Map<String, List<Student>> custStMap = StudentDataBase.getAllStudents().stream()
												.collect(Collectors.groupingBy(student->student.getGpa()>=3.8? "OUTSTANDING": "AVERAGE"));
	
		System.out.println(custStMap);
	}
	
	/*
	 * public static void groupByTwo() {
	 * 
	 * Map<String, Map<String, List<Student>>> g2Map =
	 * StudentDataBase.getAllStudents().stream()
	 * .collect(Collectors.groupingBy(student->student.getName(),
	 * Collectors.groupingBy(student->student.getGpa()>=3.8?"OUTSTANDING":"AVARAGE")
	 * ));
	 * 
	 * System.out.println(g2Map); }
	 */
	
	public static void main(String[] args) {
		
		//group();
		
		customizedGroup();
		
		//groupByTwo();
	}

}
