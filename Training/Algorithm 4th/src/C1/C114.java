package C1;

import java.util.Random;

public class C114 {

    public static void main(String[] args) {

        int num = new Random().nextInt(10);
        System.out.println("真数为：" + num);
        System.out.println("结果为：" + C114.lg(num));

    }

    public static int lg(int N) {
        int output = 0;
        int power = 0;
        int result = 1;

        while (result <= N) {
            for (int i = 1; i < power + 1; i++) {
                result *= 2;
                output = power;
            }
            power++;
        }

        return output;
    }
}
