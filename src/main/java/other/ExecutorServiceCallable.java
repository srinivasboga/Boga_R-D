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

/*class Service implements Callable<String> {

	int i;
	
	public Service(int i) {this.i=i;	}

	@Override
	public String call() throws Exception {
		System.out.println("in thread "+i);
		return "from thread"+i;
	}
	
	
	 * @Override public void run() {
	 * 
	 * System.out.println(i+" "); try { Thread.sleep(1000); } catch
	 * (InterruptedException e) { e.printStackTrace(); } }
	 	
}*/

public class ExecutorServiceCallable {

	public static void main(String[] args) throws ExecutionException {

		ExecutorService es = Executors.newFixedThreadPool(2);
		List<Future<String>> futureList = new ArrayList<>();
		System.out.println(new Date());

		for (int i = 0; i < 10; i++) {
			/* futureList.add((Future<String>) */es.submit(new Service(i));

		}
		es.shutdown();

		try {
			es.awaitTermination(10, TimeUnit.SECONDS);
			for (Future<String> fut : futureList) {
				System.out.println(fut.get());
			}
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println(new Date());

	}

}
