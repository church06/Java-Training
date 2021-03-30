package C_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C_3_19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入三角形的三边以计算周长 - 输入exit退出：");
        String input = sc.nextLine();

        String[] triangle = input.split(" ");

        ArrayList<Double> list = new ArrayList<>();

        while (!input.equals("exit")) {

            try {
                for (String i : triangle) {

                    double num = Double.parseDouble(i);
                    list.add(num);
                }

                Collections.sort(list);

                if (list.size() != 3) {
                    System.out.println("?????? 算三角形233...");

                } else if (list.get(0) + list.get(1) >= list.get(2)) {
                    System.out.println("周长是：" + (list.get(0) + list.get(1) + list.get(2)));

                } else {
                    System.out.println("输入不合法。");

                }

                input = sc.nextLine();

            } catch (NumberFormatException e) {

                System.out.println("???????");
                input = sc.nextLine();
            }
        }
    }
}
