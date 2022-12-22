package streamOperation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExm {

	
	
	public static List<Student> getSort() {
		
		return StudentDataBase.getAllStudents()
					.stream()
					.sorted(Comparator.comparing(Student::getName))
					.collect(Collectors.toList());
	}
	
	public static List<Student> getSortByGPA() {
		
		return StudentDataBase.getAllStudents()
					.stream()
					.sorted(Comparator.comparing(Student::getGpa))
					.collect(Collectors.toList());
	}
	
	public static List<Student> getDescByGPA() {
		
		return StudentDataBase.getAllStudents()
						.stream()
						.sorted(Comparator.comparing(Student::getGpa).reversed())
						.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		
		System.out.println("Sort by name: ");
		getSort().forEach(System.out::println);
		
		System.out.println("\nSort by GPA: ");
		getSortByGPA().forEach(System.out::println);
		
		System.out.println("\nSort By GPA Reverse: ");
		getDescByGPA().forEach(System.out::println);
		
	}

}
