package Tools;

import java.io.IOException;
import java.util.Arrays;

public class test {

    public static void main(String[] args) throws IOException {

        int num = 4;
        int [] a = new int[8];
        int con = a.length / num;
        int j = -1;
        for (int i = 0; i < num; i++) {
            j = j + con;
            a[i] = j;
        }
        System.out.println(Arrays.toString(a));

    }

    private static void Cost(int[][] x, double w1, double w0, double alpha) {

        double cost = 0;

        for (int[] i : x) {
            int x_temp = i[0];
            int y = i[1];
            double hw = Hw(x_temp, w1, w0);
            cost += Math.pow(y - hw, 2);
            w1 = w1 + alpha * (y - hw) * x_temp;
            w0 = w0 + alpha * (y - hw);

            System.out.println(w1 + ", " + w0 + ", " + cost);
        }
    }

    private static double Hw(int x, double w1, double w0) {
        return w0 + w1 * x;
    }
}
