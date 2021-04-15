package C_6;

public class C_6_1 {

    public static void main(String[] args) {
        C61();
    }

    public static void C61() {
        System.out.println(getPentagonalNumber(100));
    }

    public static int getPentagonalNumber(int n) {

        if (n % 10 == 0 && n != 0) {
            System.out.println();
        }

        if (n == 1) {
            return n * (3 * n - 1) / 2;

        } else {
            System.out.print(n * (3 * n - 1) / 2 + " ");
            return getPentagonalNumber(n - 1);
        }
    }
}
