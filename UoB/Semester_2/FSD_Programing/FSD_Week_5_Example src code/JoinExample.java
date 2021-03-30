/*
 * Example of Java Thread - Join
 * Date: 26 Feb 2021
 * 
 */
public class JoinExample extends Thread {

	public JoinExample(String name) {
		super(name);
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " sub thread start");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " sub thread end");
	}

	public static void main(String[] args) throws InterruptedException {

		System.out.println("main thread start");
		JoinExample t1 = new JoinExample("t1");
		t1.start();
		System.out.println("main thread wait t1 finish");
		t1.join();
		System.out.println("main thread after t1.join()");
		JoinExample t2 = new JoinExample("t2");
		t2.start();
		System.out.println("main thread wait t2 1 second, if t2 not finish continue");
		t2.join(1000);
		System.out.println("main thread after t2.join(1000)");

	}

}
