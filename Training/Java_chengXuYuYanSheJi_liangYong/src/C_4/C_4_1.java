package C_4;

import java.util.Scanner;

public class C_4_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入五边形边长：");
        double r = sc.nextDouble();

        double result = ((5 * Math.pow(2 * r * Math.sin(Math.PI / 5), 2)) / (4 * Math.tan(Math.PI / 5)));

        System.out.printf("%.2f", result);
    }
}
