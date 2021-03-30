package C_4;

import java.util.Random;

public class C_4_16 {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            Random r = new Random();
            System.out.print((char) (r.nextInt(26) + 65));
        }

    }


}
