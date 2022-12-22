package other;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoListFilteration extends Thread{

	public TwoListFilteration(String string) {
		
	}

	public void run() {
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("INside the Thread::::");
		
	}
	
	public static void main(String[] args) {
		
		List<String> l = Arrays.asList("Srinivas","Gopal", "boga");
        List<String> l1 = Arrays.asList("Srinivas","", "boga");
        
        
        List<String> simi = l.stream()
        						.filter(e -> l1.contains(e))
        						.collect(Collectors.toList());
		System.out.println(simi);
		
		TwoListFilteration t1 = new TwoListFilteration("New Thread");
		t1.start();
	}

}
