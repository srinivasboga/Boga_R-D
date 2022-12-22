package predicate;

import java.util.function.Predicate;

public class predicateExample {

	static Predicate<Integer> p1 = (i) -> i%2==0 ;
	
	static Predicate<Integer> p2 = (i) -> i%3==0;
	
	
	/*
	 * public static void PredicateAND() {
	 * 
	 * System.out.println("Predicate the Result:- "+p1.and(p2).test(4));
	 * System.out.println("Predicate AND Result: -"+p1.and(p2).test(9));
	 * 
	 * }
	 */
	
	public static Boolean PredicateAND(Integer i) {
		return p1.and(p2).test(i);
	}
	
	public static void PredicateOr() {
		System.out.println("Predicate OR Result: - " +p1.and(p2).test(14));
		System.out.println("Predicate OR Result: - "+p1.and(p2).test(18));
	}
	
	public static void PredicateNagate() {
		System.out.println("Predicate Nagate Result: - " +p1.and(p2).test(14));
		System.out.println("Predicate Nagate Result: - "+p1.and(p2).test(18));
	}
	public static void main(String[] args) {

		System.out.println(PredicateAND(14));
		
		PredicateOr();
		PredicateNagate();
		
	}

}
