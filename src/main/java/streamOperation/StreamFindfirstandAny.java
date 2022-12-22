package streamOperation;


import java.util.Optional;

public class StreamFindfirstandAny {

	
	public static Optional<Student> findFirst() {
		
		return StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGpa()>=3.9)
				.findFirst();
		
	}
	
	public static Optional<Student> findAny() {
		return StudentDataBase.getAllStudents().stream()
				.filter( t -> t.getName().contains("D"))
				.findAny();
	}
	
	public static void main(String[] args) {
		
		Optional<Student> obj = findFirst();
		
		if(obj.isPresent()) {
			System.out.println("First found Student is: \n"+obj.get());
		} else
		{
			System.out.println("Student not Found.");
		}
		
		Optional<Student> obj1 = findAny();
		
		if(obj1.isPresent()) {
			System.out.println("Find Any Method: \n"+obj1.get());
		} else {
			System.out.println("Student Not Found");
		}
		
	}

}
