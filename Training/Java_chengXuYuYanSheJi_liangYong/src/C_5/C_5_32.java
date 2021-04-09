package C_5;

import java.util.Random;

public class C_5_32 {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            System.out.println(randoms());
        }
    }

    private static int randoms() {
        Random r = new Random();
        int first = r.nextInt(10);
        int second = r.nextInt(10);

        while (first == second) {
            second = r.nextInt(10);
            System.out.println("出现重复。");
        }
        return first * 10 + second;
    }


}
