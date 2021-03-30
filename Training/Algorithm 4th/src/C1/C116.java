package C1;

public class C116 {

    public static void main(String[] args) {

        System.out.println(C116.exR1(6));

    }

    public static String exR1(int n) {
        if (n <= 0) {
            return "";
        }
        System.out.println(exR1(n - 3) + n + exR1(n - 2) + n);
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }
}
