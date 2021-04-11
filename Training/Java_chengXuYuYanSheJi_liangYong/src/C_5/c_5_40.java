package C_5;

import java.util.Random;

public class c_5_40 {

    public static void main(String[] args) {
        Throw_Coin();
    }
    
    public static void Throw_Coin() {
        int op_counter = 0;
        int ne_counter = 0;

        Random r = new Random();
        for (int i = 0; i < 1000000; i++) {
            boolean coin = r.nextBoolean();

            if (coin) {
                op_counter++;
            } else {
                ne_counter++;
            }
        }

        System.out.println("正面次数为: " + op_counter);
        System.out.println("背面次数为: " + ne_counter);
    }
}
