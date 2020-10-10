package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		return "Call Initiated by:-" + name;
	}
}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executor = Executors.newFixedThreadPool(1);
		Future<String> welcomeFuture = executor.submit(new CallableTask("Jagadeesh"));

		System.out.println("New CallableTask called");
		String welcomeMessage = welcomeFuture.get();
		System.out.println(welcomeMessage);
		System.out.println("Main Executed");

		executor.shutdown();

	}

}
