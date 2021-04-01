package C_5;

public class C_5_26 {

    public static void main(String[] args) {

        double e = 1;

        for (int i = 1; i < 100; i++) {
            e += 1 / Factorial(i);
        }

        System.out.println(e);
    }

    private static double Factorial(double n) {
        if (n == 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }
}
