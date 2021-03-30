package C_4;

import java.util.Scanner;

public class C_4_4 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("输入六边形边长：");
        double s = sc.nextDouble();

        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.printf("%.2f", area);
    }
}
