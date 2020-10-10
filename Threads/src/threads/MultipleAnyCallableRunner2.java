package threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner2 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executor = Executors.newFixedThreadPool(3);

		List<CallableTask> list = List.of(new CallableTask("Jagadeesh"), new CallableTask("Thiruveedula"),
				new CallableTask("Calling"));

		String results = executor.invokeAny(list);

		System.out.println(results);

		executor.shutdown();
	}
}
