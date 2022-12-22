package StreamTerminalOperations;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import streamOperation.Student;
import streamOperation.StudentDataBase;

public class groupingTwo {

	public static void groupByTwo() {
		
		Map<String, Map<String, List<Student>>> g2Map = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(student->student.getName(), 
						Collectors.groupingBy(student->student.getGpa()>=3.8?"OUTSTANDING":"AVARAGE")));
		
		System.out.println(g2Map);
	}
	
	public static void groupBy() {
		
		Map<String, Integer> studentMap = StudentDataBase.getAllStudents().stream()
								.collect(Collectors.groupingBy(Student::getName, 
										Collectors.summingInt(Student::getNoteBooks)));
		
		System.out.println(studentMap);
	}
	
	public static void main(String[] args) {
		
		groupByTwo();
		
		groupBy();
	}

}
