 

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise1b implements Runnable {
	private int number;

	public Exercise1b(int number) {
		this.number = number;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(number);
		}
	}

	public static void main(String[] args) {

		Exercise1b ex1 = new Exercise1b(1);
		Exercise1b ex2 = new Exercise1b(2);
		Exercise1b ex3 = new Exercise1b(3);

		// create ExecutorService to manage threads
		ExecutorService executorService = Executors.newCachedThreadPool();

		// start the three Tasks
		executorService.execute(ex1); // start task1
		executorService.execute(ex2); // start task2
		executorService.execute(ex3); // start task3

		// shut down ExecutorService--it decides when to shut down threads
		executorService.shutdown();

	}
}
