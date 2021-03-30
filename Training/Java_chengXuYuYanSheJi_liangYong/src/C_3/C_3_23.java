package C_3;

import java.util.Scanner;

public class C_3_23 {

    public static void main(String[] args) {
        C_3_23 c323 = new C_3_23();
        Scanner sc = new Scanner(System.in);

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
                    System.out.println(c323.distanceX_Y(x, y));
                    input = sc.nextLine();
                }
            } catch (NumberFormatException e) {
                System.out.println("???");
                input = sc.nextLine();
            }
        }
    }

    private String distanceX_Y(double x, double y) {
        if (x <= 5 && y <= 2.5) {
            return "点在矩阵内。";
        } else {
            return "点不在矩阵内。";
        }
    }
}
