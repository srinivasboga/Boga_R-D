package other;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

class multi implements Runnable {
	
	int i ;
	
	public multi(int i) {
		this.i=i;
	}
	
	
	@Override
	public void run() {
		System.out.println(i+" ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { e.printStackTrace(); }
	}
}

public class MultiThread {
	
	public static void main(String args[]) {
		
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		for(int i =0;i<25; i++) {
			
		}
		
		List<Integer> ll = Arrays.asList(1,4,7,9,8,60,44);
		
		Iterator<Integer> t1 = ll.iterator();
		
		ll.forEach(n->System.out.print(n));
		  //while(t1.hasNext()) { System.out.println(t1.next()); }
		List<String> l = Arrays.asList("Srinivas","Gopal", "boga");
        List<String> l1 = Arrays.asList("Srinivas","", "boga");
        
        Iterator<String> it1 = l.iterator();
        Iterator<String> it2 = l1.iterator();
        
        //boolean str = l.stream().equals(l1.get(0));
        
        //System.out.println(str);

        for(int i =0; i<l.size();i++) {
        	
        	if(l.get(i).equals(l1.get(i))) {
        		System.out.println(l.get(i));
        	}
        	
        }
	}

}
