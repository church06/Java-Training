package C_3;

import java.util.ArrayList;
import java.util.Scanner;

public class C_3_25 {

    double x;
    double y;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C_3_25 c325 = new C_3_25();

        System.out.println("输入4个点判断两条线是否平行(x1, y1), (x2, y2), (x3, y3), (x4, y4)：");
        String input = sc.nextLine();

        String[] points = input.split(" ");
        ArrayList<Double> point_list = new ArrayList<>();

        while (!input.equals("exit")) {
            try {
                for (String i : points) {
                    point_list.add(Double.parseDouble(i));

                }
                if (point_list.size() != 8) {
                    System.out.println("点坐标错误。");

                } else {
                    if (c325.calculator(point_list) == -1) {
                        System.out.println("两条线平行，无交点。");

                    } else {
                        System.out.println("交点为 x: " + c325.x + ", y: " + c325.y);

                    }
                }
                input = sc.nextLine();

            } catch (NumberFormatException e) {
                System.out.println("???");
                input = sc.nextLine();
            }
        }
    }

    private double calculator(ArrayList<Double> input) {
        double x1 = input.get(0);
        double y1 = input.get(1);
        double x2 = input.get(2);
        double y2 = input.get(3);
        double x3 = input.get(4);
        double y3 = input.get(5);
        double x4 = input.get(6);
        double y4 = input.get(7);

        double a = y1 - y2;
        double b = x1 - x2;
        double c = y3 - y4;
        double d = x3 - x4;
        double e = a * x1 - b * y1;
        double f = c * x3 - d * y3;

        if (a * d - b * c == 0) {
            return -1;
        } else {
            x = (e * d - b * f) / (a * d - b * c);
            y = (a * f - e * c) / (a * d - b * c);
            return 0;
        }
    }
}
