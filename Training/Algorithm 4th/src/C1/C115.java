package C1;

import java.util.Arrays;

public class C115 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(C115.histogram(new int[]{1, 2, 3, 4, 5, 6}, 6)));
    }

    public static int[] histogram(int[] a, int M) {
        int[] output = new int[M];

        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            int counter = 0;
            for (int j = i; j < a.length; j++) {
                try {
                    if (num == a[j]) {
                        counter++;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    j = a.length - 1;
                    if (num == a[j]) {
                        counter++;
                    }
                }
            }

            output[i] = counter;

        }


        return output;
    }
}
