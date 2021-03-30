 

public class Exercise1a extends Thread {
	private int number;

	public Exercise1a(int number) {
		this.number = number;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(number);
		}
	}

	public static void main(String[] args) {

		Exercise1a ex1 = new Exercise1a(1);
		ex1.start();

		Exercise1a ex2 = new Exercise1a(2);
		ex2.start();
		
		Exercise1a ex3 = new Exercise1a(3);
		ex3.start();

	}
}
