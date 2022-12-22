package MethodReference;

import java.util.Random;
import java.util.function.Consumer;

import streamOperation.Student;
import streamOperation.StudentDataBase;

public class MethodReferenceConsumer {

	
	static Consumer<Student> c1 = System.out::println;
	
	static Consumer<Student> c2 = Student::printListOfActivities;
	
	public static void main(String[] args) {

		StudentDataBase.getAllStudents().forEach(c1);
		
		//StudentDataBase.getAllStudents().forEach(c2);

		Random random = new Random();
		
		random.ints().limit(4).forEach(System.out::println);
	}

}
