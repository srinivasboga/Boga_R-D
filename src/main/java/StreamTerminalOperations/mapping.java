package StreamTerminalOperations;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import streamOperation.Student;
import streamOperation.StudentDataBase;

public class mapping {

	public static void main(String[] args) {

		List<String> namesList = StudentDataBase.getAllStudents().stream()
										.collect(Collectors.mapping(Student::getName, Collectors.toList()));
		
		System.out.println("Names in List:- "+namesList);
		
		Set<String> nameSet = StudentDataBase.getAllStudents().stream()
								.collect(Collectors.mapping(Student::getName, Collectors.toSet()));
		
		System.out.println("Names in Set:- "+nameSet);
	}

}
