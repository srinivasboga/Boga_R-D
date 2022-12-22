package streamOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class streamfilter {

	
	public static List<Student> streamByFilter() {
		
		return StudentDataBase.getAllStudents()
				.stream()
				.filter(student -> student.getGender().equals("male"))
				.filter(t -> t.getGpa()>=3.9)
				.collect(Collectors.toList());
	}
	
	public static List<Integer> sockMerchant(int n, List<Integer> ar) {
	    // Write your code here
	     ar.sort(Comparator.comparing(a->a));
	    
	     return ar;
	    }
	
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(44,55,11,15,4,72,26,91,80,14,43,78,70,75,36,83,78,91,17,17,54,65,60,21,58,98,87,45,75,97,81,18,51,43,84,54,66,10,44,45,23,38,22,44,65,9,78,42,100,94,58,5,11,69,26,20,19,64,64,93,60,96,10,10,39,94,15,4,3,10,1,77,48,74,20,12,83,97,5,82,43,15,86,5,35,63,24,53,27,87,45,38,34,7,48,24,100,14,80,54);
		
		//System.out.println(sockMerchant(6,list));

	     list.sort(Comparator.comparing(a->a));
	     //list.forEach(System.out::print);
	     System.out.println(list);
	     int pair = 0;
	     for(int i = 0;  i<list.size();i++) {
	    	 //System.out.println(list.get(i));
	    		if((i+1<list.size())&&(list.get(i).equals(list.get(i+1))))
				 {
	    			
	    			pair++;
	    			System.out.println(list.get(i)+" "+list.get(i+1)+" "+pair);
	    			i++;
	    			
				 }
			
	     }
	     
	     System.out.println(pair);
	     
	     
		
		//streamByFilter().forEach(System.out::println);
		
		//streamByFilter().get(1);
		
		String str = "string";
		/*
		 * char[] ch = str.toCharArray(); for(int i=0;i<ch.length;i++) {
		 * System.out.println(ch[i]);
		 * 
		 * 
		 * }
		 */
		str.chars().forEach(i->System.out.print((char)i));
		str.chars().forEach(i->System.out.print((char)i));
		
		
		List<String> l = Arrays.asList("Srinivas","Gopal","Boga");
		List<String> l1 = Arrays.asList("Ramesh","Gopal","Boga");
		
		for(int i=0;i<l1.size();i++) {
			
		if((l.get(i).equals(l1.get(i)))) {
			System.out.println(l.get(i));
			}
		}
	}

}
