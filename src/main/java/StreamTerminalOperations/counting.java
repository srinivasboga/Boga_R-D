package StreamTerminalOperations;

import java.util.stream.Collectors;

import streamOperation.StudentDataBase;

public class counting {

	public static long counting() {
		
		return StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGpa()>=3.9)
				.collect(Collectors.counting());
	}
	
	public static void main(String[] args) {
		
		System.out.println(counting());
	}

}
