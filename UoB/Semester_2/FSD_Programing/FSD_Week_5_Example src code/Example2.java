/*
 * Example of Thread creation using Java Runnable interface
 * Date: 26 Feb 2021
 */
class Example2 implements Runnable {
    public void run() {
		try {
			while (true) {
				System.out.println("thread is running..." + Thread.currentThread().getName());
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }

    public static void main(String[] args) {
        Example2 ex = new Example2();

        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(ex);
            t.start();
        }
    }
}