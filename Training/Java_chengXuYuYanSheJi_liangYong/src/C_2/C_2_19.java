package C_2;

import java.util.ArrayList;
import java.util.Scanner;

public class C_2_19 {

    public static void main(String[] args) {
        System.out.println("输入三角形的三个点 - 空格间隔：");

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        if (input.length != 6) {
            System.out.println("Error.");
        }


        ArrayList<Double> point1 = new ArrayList<>();
        ArrayList<Double> point2 = new ArrayList<>();
        ArrayList<Double> point3 = new ArrayList<>();

        int counter = 0;

        for (String i : input) {
            if (counter < 2) {
                point1.add(Double.parseDouble(i));
                ++counter;
            } else if (counter < 4) {
                point2.add(Double.parseDouble(i));
                ++counter;
            } else {
                point3.add(Double.parseDouble(i));
            }
        }

        double distance1_2 = Math.pow(Math.pow(point1.get(0) - point2.get(0), 2) +
                Math.pow(point1.get(1) - point2.get(1), 2), 0.5);

        double distance1_3 = Math.pow(Math.pow(point1.get(0) - point3.get(0), 2) +
                Math.pow(point1.get(1) - point3.get(1), 2), 0.5);

        double distance2_3 = Math.pow(Math.pow(point2.get(0) - point3.get(0), 2) +
                Math.pow(point2.get(1) - point3.get(1), 2), 0.5);

        double s = (distance1_2 + distance1_3 + distance2_3) / 2;

        double Area = Math.pow(s * (s - distance1_2) * (s - distance1_3) * (s - distance2_3), 0.5);

        System.out.println(Area);
    }
}
