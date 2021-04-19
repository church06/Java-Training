package C_6;

public class C_6_14 {

    public static void main(String[] args) {
        C_6_15();
    }

    public static void C_6_15() {

        for (int i = 1; i <= 901; i += 100) {

            System.out.println("i = " + i + ", PI = " + 4 * Compute_PI(i));
        }
    }

    public static double Compute_PI(int n) {
        if (n == 1) {
            return 1;

        } else {
            return Math.pow(-1, n + 1) / (2 * n - 1) + Compute_PI(n - 1);
        }
    }
}
