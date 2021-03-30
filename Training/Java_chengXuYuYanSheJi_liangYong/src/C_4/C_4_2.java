package C_4;

import java.util.ArrayList;
import java.util.Scanner;

public class C_4_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入第一个点：");
        String input1 = sc.nextLine();

        System.out.println("输入第二个点：");
        String input2 = sc.nextLine();

        String[] point_1 = input1.split(" ");
        String[] point_2 = input2.split(" ");

        double x1 = Double.parseDouble(point_1[0]);
        double y1 = Double.parseDouble(point_1[1]);

        double x2 = Double.parseDouble(point_2[0]);
        double y2 = Double.parseDouble(point_2[1]);

        ArrayList<Double> points = new ArrayList<>();
        points.add(x1);
        points.add(y1);
        points.add(x2);
        points.add(y2);

        for (Double i : points) {
            if (i < 0) {
                points.set(points.indexOf(i), 360 + i);
            }
        }

        x1 = Math.toRadians(points.get(0));
        y1 = Math.toRadians(points.get(1));

        x2 = Math.toRadians(points.get(2));
        y2 = Math.toRadians(points.get(3));

        double r = 6371.01;

        double d = r * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));


        System.out.println(d);
    }
}
