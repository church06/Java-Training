package C_6;

public class C_6_13 {

    public static void main(String[] args) {
        C613_method();
    }

    public static void C613_method() {
        System.out.println(Factorial(2));
    }

    public static double Factorial(int n) {

        if (n == 1) {
            return 1 / 2.0;
        } else {
            return n / (n + 1.0) + Factorial(n - 1);
        }

    }
}
