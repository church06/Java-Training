package C_5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class C_5_30 {

    public static void main(String[] args) {

        while (true) {
            System.out.print("输入存款, 年数, 月份 (用空格分割): ");
            String input = new Scanner(System.in).nextLine();

            if (input.equalsIgnoreCase("n")) {
                break;
            }

            try {
                String[] input_list = input.split(" ");

                double fund = Double.parseDouble(input_list[0]);
                double interest = Double.parseDouble(input_list[1]) / 12;
                int month = Integer.parseInt(input_list[2]);

                System.out.printf("        %s%" + Double.toString(fund).length() + "s%s     %s%n", "总金", " ", "利息", "月数");

                for (int i = 0; i < month; i++) {

                    BigDecimal fund_b = new BigDecimal(fund);
                    BigDecimal extra = new BigDecimal(fund * (interest * 0.01)).setScale(2, RoundingMode.HALF_EVEN);
                    BigDecimal total = fund_b.add(extra).setScale(2, RoundingMode.HALF_EVEN);

                    System.out.printf("金额为: %s%3s%s%6s%s%n", total, " ", extra, " ", i + 1);

                    fund = total.doubleValue();
                }

            } catch (NumberFormatException e) {
                System.out.println("输入错误");
            }

        }
        System.out.println("程序结束");

    }

    private static int Factorial(int x) {
        if (x <= 1) {
            return 1;
        } else {
            return x + Factorial(x - 1);
        }
    }
}
