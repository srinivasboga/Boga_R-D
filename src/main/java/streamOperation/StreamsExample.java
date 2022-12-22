package streamOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {
		
		Predicate<Student> stuPr = (student) -> student.getGradeLevel()>=3.9;
		
		Predicate<Student>  stuGpa = student -> student.getGpa() >= 3;
		
		Map<String, List<String>> studentAct = StudentDataBase.getAllStudents().stream()
						.filter(stuPr)
						.filter(stuGpa)
						.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		
		System.out.println(studentAct);
		
		List<String> list = new ArrayList<String>();
		list.add("Boga");
		list.add("Srinivas");
		list.add("Elon");
		list.add("Musk");
		
		
		for(String l:list) {
			System.out.println(l);
		}
		
		list.forEach(System.out::println);
		
	}
}
