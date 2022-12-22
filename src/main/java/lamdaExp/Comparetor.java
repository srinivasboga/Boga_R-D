package lamdaExp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparetor {

	public static void main(String[] args) {
		
		//@SuppressWarnings("unchecked")
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);  //0 .. o1==o2
										  //1 .. o1>o2
										  //-1 .. o1<o2
			}
		};
		System.out.println("This is legacy Comparator OutPut: "+comparator.compare(90, 80));
	
		Comparator<Integer> lambdaComparator =
					(Integer a, Integer b) -> {return a.compareTo(b);};
		System.out.println("This is Java 8: v1.0 : " +lambdaComparator.compare(10,9));
		
		Comparator<Integer> comparatorL = (a,b) -> {return a.compareTo(b);};
		System.out.println("This is Java 8: v2.0 : " +comparatorL.compare(10,9));
					
		List<Integer> li = Arrays.asList(4,7,9,8,6,2,3);
		
		System.out.println(li.stream().min(comparatorL));
	}

}
