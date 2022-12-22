package OptionalExample;

import java.util.Optional;

import streamOperation.Student;

public class OptionalExample {

	
	public static String getStudentName() {
		
		//Student student = StudentDataBase.studentSupplier.get();
		
		Student student = null;
		
		if(student!=null) {
			return student.getName();
		} 
		
		return null;
	}
	
	public static Optional<String> getStudentOptional() {
		
	//  Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
		
		Optional<Student> studentOptional = Optional.ofNullable(null);
		if(studentOptional.isPresent()) {
			
			return studentOptional.map(Student::getName);
		}
		
		return Optional.empty();
	}
	
	public static void main(String[] args) {

	//	String name = getStudentName();
		
	//	System.out.println("The Length of the student Name: "+name.length());
		
		Optional<String> optStu = getStudentOptional();
		
		if(optStu.isPresent())
			System.out.println(optStu.get().length());
		//else
			//System.out.println("Name Not Found");
		
		
	}

}
