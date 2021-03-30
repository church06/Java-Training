public class T_1001 {

    public static void main(String[] args) {
        int n = 3;
        int counter = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                counter++;
            } else {
                n = (3 * n + 1) / 2;
                counter++;
            }
        }
        System.out.println(counter);
    }
}