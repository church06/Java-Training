/*
 * Example of Thread creation using Java extend
 * Date: 26 Feb 2021
 * 
 */
class Example1 extends Thread {
	public void run() {
		System.out.println("thread is running..." + Thread.currentThread().getName());	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Example1 ex = new Example1();
			ex.start();
		}

	}
}