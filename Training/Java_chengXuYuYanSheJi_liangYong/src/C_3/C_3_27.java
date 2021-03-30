package C_3;

import java.util.ArrayList;
import java.util.Scanner;

public class C_3_27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入一个点(x, y): ");
        String input = sc.nextLine();

        while (!input.equals("exit")) {
            try {
                ArrayList<Double> point = new ArrayList<>();
                String[] pointStr = input.split(" ");

                if (pointStr.length != 2) {
                    System.out.println("坐标格式错误。");
                } else {
                    for (String i : pointStr) {
                        point.add(Double.parseDouble(i));
                    }

                    if (point.get(1) <= ((-0.5) * point.get(0) + 100)) {
                        System.out.println("该点在三角形内。");
                    } else {
                        System.out.println("该点不在三角形内。");
                    }
                }


                input = sc.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("???");
                input = sc.nextLine();
            }
        }
    }
}
