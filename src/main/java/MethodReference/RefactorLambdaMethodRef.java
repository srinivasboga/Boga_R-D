package MethodReference;

import java.util.function.Predicate;

import streamOperation.Student;
import streamOperation.StudentDataBase;

public class RefactorLambdaMethodRef {

	
	static Predicate<Student> p1 = RefactorLambdaMethodRef::getGradeBase;
	
	public static boolean getGradeBase(Student s) {
		return s.getGradeLevel()>=3;
	}
	
	public static void main(String[] args) {
		System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
	}

}
