public class Fibonacci {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(fibonacci_func(45));
        long end = System.currentTimeMillis();

        System.out.println(end - start);

    }

    public static double fibonacci_func(int n) {
        return (1 / Math.pow(5, 0.5)) * (Math.pow((1 + Math.pow(5, 0.5)) / 2, n) - Math.pow((1 - Math.pow(5, 0.5)) / 2, n));

    }
}
