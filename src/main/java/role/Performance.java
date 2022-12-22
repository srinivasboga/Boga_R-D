package role;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Performance {

	public static void main(String[] args) {
		
		/*
		 * Imperative way 
		 */
		
		int sum = IntStream.rangeClosed(0, 1000000).sum();
		
		System.out.println("Sum is:  "+sum);
		
		/*
		 * Declarative programming 
		 * */
		
		List<Integer> list = Arrays.asList(0,2,2,3,1,4,4,44,5,6,7,8,8,9,9,0);
		
		list.stream().sorted().collect(Collectors.toList());
		
		//Collections.sort(list);
		
		System.out.println("Sorted Array: "+list);
		
		List<Integer> uniqueList = list.stream()
							.distinct()
							.toList();
		
		System.out.println("Unique value Listed Array: "+uniqueList);
		
		/*
		 * Runnable Functional Interface - Lambda Expressions
		 */
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println(" This is Runnable Imperative way..");
			}
		};
		new Thread(r).start();
		
		/*Declarative way
		 * */
		
		Runnable rL = () -> {System.out.println("This is in Runnable Declarative way... Java 8"); };
		
		Runnable rL1 = () -> System.out.println("This is in Runnable Declarative way... Java 8\"");
		
		new Thread(rL1).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
			System.out.println("Legacy");
			}	
		}).start();
		
		new Thread( () -> System.out.println("This is inside the java 8 thread")).start();
		
		
	}

}
