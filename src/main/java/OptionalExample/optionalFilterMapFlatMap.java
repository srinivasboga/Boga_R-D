package OptionalExample;

import java.util.Optional;

import streamOperation.Bike;
import streamOperation.Student;
import streamOperation.StudentDataBase;

public class optionalFilterMapFlatMap {

	
	public static void filter() {
		Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
		optionalStudent.filter(student -> student.getGpa()>=3.5)
				.ifPresent(student -> System.out.println(student));
		
	}
	
	public static void optionaMap() {
		Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
		if(optionalStudent.isPresent()) {
		Optional<String> optionalString = optionalStudent.filter(student->student.getGpa()>=3.5)
												.map(Student::getName);
		
		System.out.println(optionalString.get());
		}
	}
	
	public static void optinalFlatMap() {
		Optional<Student> optinalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
		Optional<String> name = optinalStudent
									.filter(student->student.getGpa()>=3.5) //Optional<Student Optional<Bike>>
									.flatMap(Student::getBike)   //returns ->  Optional<Bike>
									.map(Bike::getName);
		
		name.ifPresent(s-> System.out.println("Name: "+s));
	}
	
	public static void main(String[] args) {
		
		filter();
		optionaMap();
		optinalFlatMap();
	}

}
