package C_5;

import java.util.ArrayList;
import java.util.Scanner;

public class C_5_1 {

    public static void main(String[] args) {

        C_5_1 c51 = new C_5_1();
        c51.c51_Method();

    }

    public void c51_Method() {

        ArrayList<Integer> list = detect_factory();

        double total = 0;
        double average;
        int positive = 0;
        int negative = 0;

        for (int i : list) {

            if (i < 0) {
                negative++;
            } else {
                positive++;
            }

            total += i;
        }

        average = total / list.size();
        System.out.println(list);

        System.out.printf("正数：%d%n负数：%d%n总和：%.1f%n平均数：%.2f", positive, negative, total, average);

    }

    private ArrayList<Integer> detect_factory() {

        String[] temp;
        ArrayList<Integer> output = new ArrayList<>();

        while (true) {
            System.out.print("输入一组数字：");
            String input = new Scanner(System.in).nextLine();

            try {
                temp = input.split(" ");

                for (String i : temp) {
                    int num = Integer.parseInt(i);
                    if (num != 0) {
                        output.add(num);
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入错误");
            }
        }




        return output;
    }
}
