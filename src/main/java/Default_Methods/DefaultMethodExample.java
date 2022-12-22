package Default_Methods;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import streamOperation.Student;
import streamOperation.StudentDataBase;

public class DefaultMethodExample {

	
	static Consumer<Student>  studentConsumer = (student -> System.out.println(student));
	
	static Comparator<Student> nameComparator = Comparator.comparing(Student::getName) ;
	static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);
	static Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa);
	
	
	
	public static void soryByName(List<Student> list) {
		
		System.out.println("After sort list by name: ");
		
		
		list.sort(nameComparator);
		list.forEach(studentConsumer);
		
	}
	
	public static void soryByGpa(List<Student> list) {
		
		System.out.println("After sorting by GPA: ");
		Comparator<Student> gpaCompartor = Comparator.comparing(Student::getGpa);
		
		list.sort(gpaCompartor);
		list.forEach(studentConsumer);
	}
	
	public static void chainingComparator(List<Student> list) {
		System.out.println("After chainingComparator: ");
		
		list.sort(gradeComparator.thenComparing(nameComparator));
		list.forEach(studentConsumer);
	}
	
	public static void chainingComparator2(List<Student> list) {
		System.out.println("After chainig Compartor 2: ");
		
		list.sort(gpaComparator.thenComparing(nameComparator));
		list.forEach(studentConsumer);
	}
	
	public static void sortWithNullValues(List<Student> list) {
		
		System.out.println("After sortWithNullValues: ");
		Comparator<Student> studentComparator = Comparator.nullsLast(nameComparator);
		list.sort(studentComparator);
		list.forEach(studentConsumer);
		
	}
	
	public static void main(String[] args) {
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		System.out.println("Before Sort List: ");
		
		studentList.forEach(studentConsumer);
		/*
		 * soryByName(studentList);
		 * 
		 * soryByGpa(studentList);
		 * 
		 * chainingComparator(studentList);
		 * 
		 * chainingComparator2(studentList);
		 * 
		 */	sortWithNullValues(studentList);
		
	}

}
