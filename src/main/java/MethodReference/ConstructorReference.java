package MethodReference;

import java.util.function.Function;
import java.util.function.Supplier;

import streamOperation.Student;

public class ConstructorReference {

	
	static Supplier<Student> studentSupplier = Student::new;
	
	public static Function<String, Student> studentSupplierFunc  = Student::new;
	
	
	
	public static void main(String[] args) {

			System.out.println(studentSupplier.get());
			System.out.println(studentSupplierFunc.apply("ABC"));
	}

}
