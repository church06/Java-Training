package C_5;

import java.util.ArrayList;

public class C_5_27 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 101; i <= 2100; i++) {
            if (i % 4 == 0) {
                list.add(i);
            }
        }

        int counter = 1;

        for (int i : list) {
            if (counter == 10) {
                counter = 1;
                System.out.println(i);
            } else {
                ++counter;
                System.out.print(i + " ");
            }
        }
    }
}
