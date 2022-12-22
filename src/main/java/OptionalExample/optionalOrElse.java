package OptionalExample;

import java.util.Optional;

import streamOperation.Student;
import streamOperation.StudentDataBase;

public class optionalOrElse {

	public static String orElse() {
		
		Optional<Student> optionalOrElse = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
		String name = optionalOrElse.map(Student::getName).orElse("Default");
		
		return name;
	}
	
	public static String orElseGet() {
		
		Optional<Student> optionalOrElseGet = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
		String name = optionalOrElseGet.map(Student::getName).orElseGet(()->"Default");
		
		return name;
	}
	
	public static String orElseThrow() {
		
			Optional<Student> optionalThrow = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
		//	Optional<Student> optionalThrow = Optional.ofNullable(null);
			String name = optionalThrow.map(Student::getName).orElseThrow(()->new RuntimeException("Data is not Available"));
		
			return name;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(" orElse : "+orElse());
		
		System.out.println(" orElseGet : "+orElseGet());
		
		System.out.println(" orElseThrow : "+orElseThrow());
		
	}

}
