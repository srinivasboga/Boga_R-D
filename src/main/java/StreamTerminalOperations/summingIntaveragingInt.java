package StreamTerminalOperations;

import java.util.stream.Collectors;

import streamOperation.Student;
import streamOperation.StudentDataBase;

public class summingIntaveragingInt {
	
	/*
	 * public static long sumM() {
	 * 
	 * return StudentDataBase.getAllStudents().stream() .map(Student::getNoteBooks)
	 * .count(); }
	 */

	public static int sum() {
		
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.summingInt(Student::getNoteBooks));
	}
	
	public static Double avg() {
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.averagingInt(Student::getNoteBooks));
	}
	
	public static void main(String[] args) {

		System.out.println(sum());
		
		System.out.println(avg());
		
	}

}
