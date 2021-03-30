package C1;

import java.util.Arrays;

public class C113 {

    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        int[][] matrix = new int[y][x];

        for (int[] i : matrix) {
            System.out.println(Arrays.toString(i));
        }
    }

}
