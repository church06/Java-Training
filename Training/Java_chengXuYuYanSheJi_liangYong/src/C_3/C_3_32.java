package C_3;

import java.util.ArrayList;
import java.util.Scanner;

public class C_3_32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入两个点坐标: ");
        String input = sc.nextLine();

        String[] inputStr = input.split(" ");
        ArrayList<Double> points = new ArrayList<>();

        for (String i : inputStr) {
            points.add(Double.parseDouble(i));
        }

        double x0 = points.get(0);
        double y0 = points.get(1);

        double x1 = points.get(2);
        double y1 = points.get(3);

        double x2 = points.get(4);
        double y2 = points.get(5);

        double result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        if (result > 0) {
            System.out.println("p2在线段左侧");
        } else if (result == 0) {
            System.out.println("p2在线段上");
        } else {
            System.out.println("p2在线段右侧");
        }
    }
}
