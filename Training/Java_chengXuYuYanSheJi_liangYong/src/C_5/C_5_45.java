package C_5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class C_5_45 {

    public static void main(String[] args) {
        C545_method();
    }

    public static void C545_method() {

        while (true) {
            System.out.print("输入一组数，用逗号分割: ");

            try {
                String input = new Scanner(System.in).nextLine().replaceAll(" ", "");

                if (input.equalsIgnoreCase("n")) {
                    break;
                }

                String[] data_s = input.split(",");

                ArrayList<Double> list = new ArrayList<>();

                for (String data : data_s) {
                    double num = Double.parseDouble(data);
                    list.add(num);
                }

                double total = 0;
                double total_pow = 0;

                for (Double i : list) {
                    total+= i;
                    total_pow += Math.pow(i, 2);
                }

                System.out.println("平均值为: " + new BigDecimal
                        (total / list.size()).setScale(2, RoundingMode.HALF_EVEN));

                double variance = Math.pow((total_pow - (Math.pow(total, 2) / list.size())) / (list.size() - 1), 0.5);

                System.out.println("方差为: " + new BigDecimal(variance).setScale(2, RoundingMode.HALF_EVEN));

            } catch (NumberFormatException e) {
                System.out.println("输入错误");
            }
        }
    }
}
