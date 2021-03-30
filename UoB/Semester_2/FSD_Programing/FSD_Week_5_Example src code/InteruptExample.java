/*
 * Example of Java Thread - Interrupt
 * Date: 26 Feb 2021
 * 
 */
public class InteruptExample extends Thread {

	public void run() {
		System.out.println("Task 1");
		try {

			while (true) {

				System.out.println(Thread.currentThread().getName() + " is running");
				Thread.sleep(1000);  
			}
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " is interrupted");
		} finally {
			System.out.println("Finally...");
			// close connection, free port etc
		}

	}

	public static void main(String args[]) {

		InteruptExample ex1 = new InteruptExample();
		ex1.start();

		ex1.interrupt();

	}
}