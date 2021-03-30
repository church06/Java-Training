package C_4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class C_4_7 {


    public static void main(String[] args) {

        int r = 0;
        int num = 0;
        boolean cut = true;

        while (cut) {
            try {
                System.out.println("输入半径：");
                r = new Scanner(System.in).nextInt();
                System.out.println("输入点数：");
                num = new Scanner(System.in).nextInt();
                cut = false;
            } catch (InputMismatchException e) {
                System.out.println("???");
            }
        }
        C_4_7 c47 = new C_4_7();


        ArrayList<double[]> points = c47.point_Approach(r, num);
        System.out.println(points);


    }

    public boolean detectDegree(int[] input1, int[] input2, int r) {

        boolean detected = false;

        double distance = Math.abs(Math.pow(Math.pow(input1[0] - input2[0], 2) + Math.pow(input1[1] - input2[1], 2), 0.5));
        BigDecimal b = new BigDecimal(distance);

        double distance_2f = b.setScale(0, RoundingMode.HALF_EVEN).doubleValue();

        if (distance_2f == (2 * r * Math.sin(36))) {
            detected = true;
        }

        return detected;
    }

    public ArrayList<double[]> point_Approach(int r, int num) {

        ArrayList<double[]> output = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            double[] point = randomXY(r);

            while (Math.pow(point[0], 2) + Math.pow(point[1], 2) != Math.pow(r, 2)) {
                point = randomXY(r);
            }

            output.add(point);
        }


        return output;
    }

    public double randomOpNe(double input) {
        Random r = new Random();
        double output;
        boolean opNe = r.nextBoolean();
        if (opNe) {
            output = input * -1;
            return output;
        } else {
            output = input;
            return output;
        }
    }

    public double[] randomXY(int bound) {
        double[] output = new double[2];
        Random r = new Random();
        double x = randomOpNe(r.nextDouble() * bound);
        double y = randomOpNe(r.nextDouble() * bound);
        output[0] = x;
        output[1] = y;
        return output;
    }
}
