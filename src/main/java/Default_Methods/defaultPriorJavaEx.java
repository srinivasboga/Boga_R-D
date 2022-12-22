package Default_Methods;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class defaultPriorJavaEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("Adam","Jenny","Alex","Den","Mike","Eric");
		
		/**
		 *  Prior to Java
		 * */
	    Collections.sort(stringList);
	    
	    System.out.println("Prior to Java 8 using Collections.sort(): "+stringList);
	    
	    /**
	     *  From Java 8
	     */
	    List<String> stringList8 = Arrays.asList("Adam","Jenny","Alex","Den","Mike","Eric");
	    
	    stringList8.sort(Comparator.naturalOrder());
	    
	    System.out.println("From Java 8 using sort() : " +stringList8);
	    
	}

}
