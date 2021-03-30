package C_4;

import java.util.Random;

public class C_4_25 {

    public static void main(String[] args) {

        C_4_25 c425 = new C_4_25();

        for (int i = 0; i < 10; i++) {
            c425.c425_method();
        }
    }

    public void c425_method() {

        char letter;
        int num;
        int counter = 0;
        StringBuilder license = new StringBuilder();

        for (int i = 0; i < 7; i++) {
            if (counter >= 3) {
                num = new Random().nextInt(10);
                license.append(num);
            } else {
                letter = (char) (new Random().nextInt(26) + 65);
                counter++;
                license.append(letter);
            }
        }

        System.out.println(license);
    }
}
