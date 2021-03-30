package C_5;

import java.util.ArrayList;

public class C_5_20 {

    public static void main(String[] args) {
        for (int i = 2; i < 1001; i++) {
            ArrayList<Integer> counter = new ArrayList<>();

            for (int j = i; j > 0; j--) {
                if (i % j == 0) {
                    counter.add(1);
                } else {
                    counter.add(0);
                }
            }

            boolean switcher = true;
            for (int j = 1; j < counter.size() - 1; j++) {
                if (counter.get(j) == 1) {
                    switcher = false;
                    break;
                }
            }

            if (switcher) {
                System.out.println(i);
            }
        }
    }
}