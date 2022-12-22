package other;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class Service implements Callable<String> {

	int i;
	
	public Service(int i) {
		this.i=i;
	}
	
	/*
	 * @Override public void run() {
	 * 
	 * System.out.println(i+" "); try { Thread.sleep(1000); } catch
	 * (InterruptedException e) { e.printStackTrace(); } }
	 */

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		System.out.println("in thread "+i);
		return "from Thread "+i;
	}	
}

public class ExecutorServiceExa {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		
		ExecutorService es  =  Executors.newFixedThreadPool(2);
		System.out.println(new Date());
		List<Callable<String>> callableList = new ArrayList<>();
		callableList.add(new Service(1));
		callableList.add(new Service(2));
		callableList.add(new Service(3));
		callableList.add(new Service(4));
		callableList.add(new Service(5));
		List<Future<String>> futureList= es.invokeAll(callableList);
		System.out.println("=====================");
		
		for(Future<String> fut:futureList) {
			System.out.println(fut.get());
		}
		/*
		 * for(int i=0;i<10;i++) { futureList.add((Future<String>) es.submit(new
		 * Service(i)));
		 * 
		 * }
		 */es.shutdown();
		
		 es.awaitTermination(10, TimeUnit.SECONDS);
		 System.out.println("=====================");
		// System.out.println(str);
		/*
		 * try { es.awaitTermination(10, TimeUnit.SECONDS); for(Future<String> fut:
		 * futureList) { System.out.println(fut.get()); } } catch (InterruptedException
		 * e) {
		 * 
		 * e.printStackTrace(); }
		 */
		System.out.println(new Date());
		
	}
 

}
