/// extends thread
//implements runnable

package threads;

import java.util.stream.IntStream;

class Task extends Thread {

	private int num;

	public Task(int num) {
		this.num = num;

	}
	@Override
	public void run() {
		System.out.println("Task:-" + num + " Started");
		int sum = IntStream.range(num * 100, num * 100 + 99).reduce(0, (n1, n2) -> n1 + n2);

		System.out.println("Task:-" + num + " Completed and Sum is:-" + sum);
	}
	
}

class Task2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task2 Started");
		int sum1 = IntStream.range(100, 201).reduce(0, (n1, n2) -> n1 + n2);
		System.out.println("Task2 Completed:-" + sum1);

	}

}

class Task3 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task3 Started");
		int sum2 = IntStream.range(200, 301).reduce(0, (n1, n2) -> n1 + n2);

		System.out.println("Task3 Completed:-" + sum2);

	}

}

public class ThreadsRunner {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		

		Task2 task2= new Task2();
		Thread thread = new Thread(task2);
		thread.setPriority(10); // prioritizing threads
		thread.start();

		Task3 task3 = new Task3();
		Thread thread1 = new Thread(task3);
		thread1.start();

		// keeping dependency on other tasks using join operation.

		thread1.join();
		// waiting thread execution state
		thread1.sleep(100000);



		System.out.println("Task4 Started");
		int sum3 = IntStream.range(300, 401).reduce(0, (n1, n2) -> n1 + n2);
		System.out.println("Task4 Completed:-" + sum3);
		System.out.println("Task5 Started");
		int sum4 = IntStream.range(400, 501).reduce(0, (n1, n2) -> n1 + n2);
		System.out.println("Task5 Completed:-" + sum4);

	}

}
