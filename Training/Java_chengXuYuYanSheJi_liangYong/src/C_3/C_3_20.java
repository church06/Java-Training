package C_3;

import java.util.Scanner;

public class C_3_20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("输入华氏度 (-58 ~ 41)：");
        double t = sc.nextDouble();

        System.out.println("输入风速(>= 2)：");
        double v = sc.nextDouble();

        double outside = 0;

        if (t < 41 && t > -58) {
            if (v >= 2) {
                outside = 35.74 + (0.6215 * t) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * t * Math.pow(v, 0.16));
            } else {
                System.out.println("Error.");
            }
        } else {
            System.out.println("Error.");
        }

        System.out.println(outside);
    }
}
