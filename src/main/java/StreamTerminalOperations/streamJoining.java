package StreamTerminalOperations;

import java.util.stream.Collectors;

import streamOperation.StudentDataBase;
import streamOperation.Student;
public class streamJoining {

	public static String joining1() {
		
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.collect(Collectors.joining());
	}
	
	public static String joining2() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.collect(Collectors.joining("\n"));
	}
	
	public static String joining_2() {
		return StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.collect(Collectors.joining("-", "(", ")"));
	}
	
	public static void main(String[] args) {

		System.out.println(joining1());
		
		System.out.println(joining2());
		
		System.out.println(joining_2());
		
	}

}
