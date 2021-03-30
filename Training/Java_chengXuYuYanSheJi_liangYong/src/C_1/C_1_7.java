package C_1;

public class C_1_7 {

    public static void main(String[] args) {

        double a = 1;
        for (int i = 0; i < 6; i++) {

            if (i != 0) {
                int counter = 2 * i + 1;

                if (i % 2 == 0) {
                    a += 1.0 / counter;
                } else {
                    a -= 1.0 / counter;
                }
            }
        }

        double pi = 4 * a;
        System.out.println("i = 6: " + pi);

        // ==========================================
        a = 1;

        for (int i = 0; i < 7; i++) {

            if (i != 0) {
                int counter = 2 * i + 1;

                if (i % 2 == 0) {
                    a += 1.0 / counter;
                } else {
                    a -= 1.0 / counter;
                }
            }
        }

        pi = 4 * a;
        System.out.println("i = 7: " + pi);
    }
}
