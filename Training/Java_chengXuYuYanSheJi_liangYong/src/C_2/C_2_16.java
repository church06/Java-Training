package C_2;

import java.util.Scanner;

public class C_2_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入六边形边长：");
        double input = sc.nextDouble();

        double Area = (3 * Math.pow(3, 0.5) / 2) * Math.pow(input, 2);

        System.out.println(Area);
    }
}
