import java.util.Arrays;
import java.util.Random;

public class Exercise2 extends Thread {
    private int[] a;
    private int min, max, sum;

    // Constructor
    public Exercise2(int[] a, int min, int max) {
        this.a = a;
        this.min = min;
        this.max = max;
    }

    // Computes the total sum of all elements of the given array.
    public static int sum(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++)
            result += a[i];
        return result;
    }

    // Computes the total sum of elements of the given array in given range (min,max)
    public synchronized static int sumRange(int[] a, int min, int max) {
        int total = 0;
        for (int i = min; i < max; i++)
            total += a[i];
        return total;
    }

    // thread run method
    public void run() {

        //Incomplete. Add code here
        sum = sumRange(a, min, max);
        System.out.println(Thread.currentThread().getName() + " is running.");
    }

    // Parallel version (two threads)
    public static int sum_parallel(int[] a) {
        //Incomplete. Add code here

        int set_contain = 4;
        int piece = a.length / set_contain;
        int cut = 4;
        int j = 0;
        int[] container = new int[set_contain];

        for (int i = 0; i < cut; i++) {
            j = j + piece;
            container[i] = j;
        }
        System.out.println(Arrays.toString(container));

        Exercise2 con1 = new Exercise2(a, 0, container[0]);
        Exercise2 con2 = new Exercise2(a, container[0], container[1]);
        Exercise2 con3 = new Exercise2(a, container[1], container[2]);
        Exercise2 con4 = new Exercise2(a, container[2], container[3]);


        con1.start();
        con2.start();
        con3.start();
        con4.start();

        try {
            con1.join();
            con2.join();
            con3.join();
            con4.join();
        } catch (InterruptedException ignored) {

        }

        return con1.sum + con2.sum + con3.sum + con4.sum;
    }

    // Create an array of given length containing random values
    public static int[] createRandomArray(int length) {
        int[] a = new int[length];
        Random rand = new Random();
        for (int i = 0; i < a.length; i++)
            a[i] = rand.nextInt(50);
        return a;
    }

    public static void main(String[] args) {
        int size = 100; // length of array
        int[] a = createRandomArray(size);
        System.out.println(Arrays.toString(a));
        int total = sum_parallel(a); // With Threads
        int correct = sum(a); // Without Threads

        if (total != correct) {
            throw new RuntimeException("wrong sum: " + total + " vs. " + correct);
        } else
            System.out.println("Sum = " + total);
    }
}
