package C_4;

import java.util.Arrays;
import java.util.Random;

public class C_4_6 {

    public static void main(String[] args) {
        C_4_6 c46 = new C_4_6();
        System.out.println(Arrays.toString(c46.c46Method()));

    }

    public double[] c46Method() {
        int r = 40;

        int[] point1 = onTheCircle(r);
        int[] point2 = onTheCircle(r);
        int[] point3 = onTheCircle(r);

        while (Arrays.equals(point1, point2) && Arrays.equals(point1, point3) && Arrays.equals(point2, point3)) {
            if (Arrays.equals(point1, point2)) {
                point2 = onTheCircle(r);
            } else if (Arrays.equals(point1, point3)) {
                point3 = onTheCircle(r);
            } else if (Arrays.equals(point2, point3)) {
                point1 = onTheCircle(r);
            }
        }

        double[] num = angleToDegree(point1, point2, point3);

        while (Arrays.toString(num).contains("0.0")) {
            point1 = onTheCircle(r);
            point2 = onTheCircle(r);
            point3 = onTheCircle(r);

            num = angleToDegree(point1, point2, point3);
        }
        return num;
    }

    public int randomOpNe(int input) {
        Random r = new Random();
        int output;
        boolean opNe = r.nextBoolean();
        if (opNe) {
            output = input * -1;
            return output;
        } else {
            output = input;
            return output;
        }
    }

    public int[] randomXY(int bound) {
        int[] output = new int[2];
        Random r = new Random();
        int x = randomOpNe(r.nextInt(bound));
        int y = randomOpNe(r.nextInt(bound));
        output[0] = x;
        output[1] = y;
        return output;
    }

    public int[] onTheCircle(int r) {
        int[] input = randomXY(r);

        while (Math.pow(input[0], 2) + Math.pow(input[1], 2) != Math.pow(r, 2)) {
            input = randomXY(r);
        }
        return input;
    }

    public double[] angleToDegree (int[] point1, int[] point2, int[] point3) {
        double[] output = new double[3];

        double a = Math.abs(Math.pow(Math.pow(point1[0] - point2[0], 2) + Math.pow(point1[1] - point2[1], 2), 0.5));
        double b = Math.abs(Math.pow(Math.pow(point1[0] - point3[0], 2) + Math.pow(point1[1] - point3[1], 2), 0.5));
        double c = Math.abs(Math.pow(Math.pow(point2[0] - point3[0], 2) + Math.pow(point2[1] - point3[1], 2), 0.5));

        double cosA = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c);
        double cosB = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c);
        double cosC = (Math.pow(b, 2) + Math.pow(a, 2) - Math.pow(c, 2)) / (2 * a * b);

        double cornA = Math.toDegrees(Math.acos(cosA));
        double cornB = Math.toDegrees(Math.acos(cosB));
        double cornC = Math.toDegrees(Math.acos(cosC));

        output[0] = cornA;
        output[1] = cornB;
        output[2] = cornC;

        return output;
    }
}
