package C_3;

import java.util.Random;

public class C_3_16 {

    Random r = new Random();
    int x_po = r.nextInt(50);
    int x_ne = r.nextInt(50) * (-1);

    int y_po = r.nextInt(100);
    int y_ne = r.nextInt(100) * (-1);

    int[] x_list = {x_ne, x_po};
    int[] y_list = {y_ne, y_po};

    public static void main(String[] args) {
        C_3_16 c316 = new C_3_16();

        Random r = new Random();
        int x_token = r.nextInt(2);
        int y_token = r.nextInt(2);

        System.out.println(c316.x_list[x_token] + ", " + c316.y_list[y_token]);

    }
}
