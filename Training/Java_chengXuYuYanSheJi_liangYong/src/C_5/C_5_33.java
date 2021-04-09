package C_5;

import java.util.ArrayList;

public class C_5_33 {

    public static void main(String[] args) {
        System.out.println(PerfectNumber());
    }

    private static ArrayList<Integer> PerfectNumber() {

        ArrayList<Integer> ouput = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            int counter = 0;
            for (int j = 1; j < i; j++) {

                if (i % j == 0) {
                    counter += j;
                }
            }

            if (counter == i) {
                ouput.add(i);
            }
        }
        return ouput;
    }
}
