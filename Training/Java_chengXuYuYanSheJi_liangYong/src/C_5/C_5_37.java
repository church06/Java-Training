package C_5;

import java.util.ArrayList;

public class C_5_37 {

    public static void main(String[] args) {
        System.out.println(to_Base(2, 2));
    }

    public static String to_Base(int num, int base) {

        StringBuilder output = new StringBuilder("结果为 ");
        ArrayList<Integer> list = new ArrayList<>();

        while (num >= 1) {
            int mod = num % base;
            num /= base;

            list.add(mod);
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            output.append(list.get(i));
        }

        return output.toString();
    }
}
