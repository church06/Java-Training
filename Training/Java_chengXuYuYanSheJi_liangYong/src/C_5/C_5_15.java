package C_5;

public class C_5_15 {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 33; i < 127; i++) {
            if (count == 9) {
                System.out.print((char) i + "\n");
            } else {
                System.out.print((char) i + " ");
            }
            count++;

            if (count == 10) {
                count = 0;
            }
        }

    }
}
