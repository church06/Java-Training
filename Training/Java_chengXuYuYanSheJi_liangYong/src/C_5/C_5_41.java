package C_5;

import java.util.ArrayList;
import java.util.Random;

public class C_5_41 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(10);
            list.add(num);
        }
        System.out.println(list);
        Max_num_counter(list);

    }

    public static void Max_num_counter (ArrayList<Integer> input_list) {

        int counter = 0;
        int num = Integer.MIN_VALUE;

        for (int i : input_list) {
            if (i > num) {
                num = i;
                counter = 1;
            } else if (i == num){
                counter++;
            }
        }
        System.out.println("最大数为: " + num + " 总共有: " + counter + " 个。");
    }
}
