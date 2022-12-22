package streamOperation;

public class StreamMRF {

	
	public static int totalNoOfNoteBooks() {
		return StudentDataBase.getAllStudents().stream()
				.filter(t -> t.getGradeLevel()>=3)
				.map(Student::getNoteBooks)
				//.reduce(0,(a,b) -> a+b);
				.reduce(0, Integer::sum);
	}
	
	public static void main(String[] args) {
		
		System.out.println(totalNoOfNoteBooks() );
		
	}

}
