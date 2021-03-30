package C_3;

import java.util.Scanner;

public class C_3_22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C_3_22 c322 = new C_3_22();

        System.out.println("输入坐标 (x, y)：");
        String input = sc.nextLine();

        while (!input.equals("exit")) {
            try {
                String[] points = input.split(" ");
                if (points.length != 2) {
                    System.out.println("坐标错误。");
                    input = sc.nextLine();
                } else {
                    double x = Double.parseDouble(points[0]);
                    double y = Double.parseDouble(points[1]);
                    double distance = c322.distance(x, y);
                    System.out.print("距离为：" + distance + " // ");
                    if (distance <= 10) {
                        System.out.println("点在圆内。");
                        input = sc.nextLine();
                    } else {
                        System.out.println("点在圆外");
                        input = sc.nextLine();
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("???");
                input = sc.nextLine();
            }
        }
    }

    private double distance(double x, double y) {
        return Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);
    }
}
