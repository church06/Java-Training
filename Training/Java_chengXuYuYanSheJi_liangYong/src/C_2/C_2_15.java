package C_2;

import java.util.ArrayList;
import java.util.Scanner;

public class C_2_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入x1 y1：");
        String[] x1_y1 = sc.nextLine().split(" ");
        System.out.println("输入x2 y2：");
        String[] x2_y2 = sc.nextLine().split(" ");

        ArrayList<Double> point1 = new ArrayList<>();
        ArrayList<Double> point2 = new ArrayList<>();

        for (String i : x1_y1) {
            point1.add(Double.parseDouble(i));
        }

        for (String i : x2_y2) {
            point2.add(Double.parseDouble(i));
        }

        double distance = Math.pow(Math.pow(point1.get(0) - point2.get(0), 2) +
                Math.pow(point1.get(1) - point2.get(1), 2), 0.5);

        System.out.println(distance);
    }
}
