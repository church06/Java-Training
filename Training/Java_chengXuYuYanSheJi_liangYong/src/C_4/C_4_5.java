package C_4;

import java.util.Scanner;

public class C_4_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入边数：");
        int n = sc.nextInt();

        System.out.println("输入边长：");
        double s = sc.nextDouble();

        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
        System.out.println(area);
    }
}
