package other;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServ {

	public static void main(String[] args) {
		
		int coreCount = Runtime.getRuntime().availableProcessors();
		
		ExecutorService service = Executors.newFixedThreadPool(coreCount);
		
		for(int i =0; i<10;i++) {
			//service.execute(new CpuIntensiveTask());
		}	
	}
}

