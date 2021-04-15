package C_6;

public class C_6_2 {

    public static void main(String[] args) {
        C62_method();
    }

    public static void C62_method() {
        System.out.println(sumDigits(234));
    }

    public static int sumDigits(long n) {

        if (n == 0) {
            return 0;
        }else {
            int num = (int) (n % 10);
            return num + sumDigits(n / 10);
        }
    }
}
