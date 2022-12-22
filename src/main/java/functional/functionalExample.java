package functional;

import java.util.function.Function;

public class functionalExample {

	static Function<String, String> fun = (s) -> s.toUpperCase();
	
	static Function<String, String> con = (s) -> s.toUpperCase().concat("Srinivas");
	
	
	public static void main(String[] args) {
		
		System.out.println("Function with apply:- "+fun.apply("Boga"));
		
		System.out.println("Function of andThen is Concatinate:- "+fun.andThen(con).apply("Boga "));

		System.out.println("Function of andThen is Concatinate:- "+fun.compose(con).apply("Boga "));
	}

}
