/*
 * Example of Java Thread ExecutorService  
 * Date: 26 Feb 2021
 * 
 */
 
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterExample implements Runnable {
	private final String taskName; // name of task

	// constructor
	public ExecuterExample(String taskName) {
		this.taskName = taskName;

	}

	// method run contains the code that a thread will execute
	public void run() {
		try {
			System.out.println(taskName + " going to sleep for 3 seconds");
			Thread.sleep(3000); // 3 seconds
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}
		System.out.println(taskName + " done sleeping");
	}

	public static void main(String[] args) {
		// create and name each runnable
		ExecuterExample task1 = new ExecuterExample("task1");
		ExecuterExample task2 = new ExecuterExample("task2");
		ExecuterExample task3 = new ExecuterExample("task3");

		System.out.println("Starting Executor");

		// create ExecutorService to manage threads
		ExecutorService executorService = Executors.newCachedThreadPool();

		// start the three Tasks
		executorService.execute(task1); // start task1
		executorService.execute(task2); // start task2
		executorService.execute(task3); // start task3

		// shut down ExecutorService--it decides when to shut down threads
		executorService.shutdown();

		System.out.printf("Tasks started, main ends.%n%n");
	}
} // end class 




