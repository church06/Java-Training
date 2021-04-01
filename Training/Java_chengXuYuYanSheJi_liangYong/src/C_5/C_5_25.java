package C_5;

public class C_5_25 {

    public static void main(String[] args) {
        System.out.println(4 * Compute_PI(10000));
    }

    public static double Compute_PI(double i) {
        if (i <= 1) {
            return 1;
        } else {
            return (Math.pow(-1, i + 1) / (2 * i - 1)) + Compute_PI(i - 1);
        }
    }
}
