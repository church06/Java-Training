package C_5;

import java.util.ArrayList;

public class C_5_16 {

    public static void main(String[] args) {

        int num = 120;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                num /= i;
                list.add(i);
                i = 1;
            }
        }
        list.add(num);
        System.out.println(list);
    }
}
