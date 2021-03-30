package C_5;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class C_5_2 {

    public static void main(String[] args) {

        C_5_2 c52 = new C_5_2();
        c52.c52_Method();

    }

    public void c52_Method() {

        while (true) {
            double num_1 = Double.parseDouble(new DecimalFormat("#.00").format(new Random().nextInt(10) + 1));
            double num_2 = Double.parseDouble(new DecimalFormat("#.00").format(new Random().nextInt(10) + 1));

            char[] signs = {'+', '-', '*', '/'};
            int sign_r = new Random().nextInt(4);
            char sign = signs[sign_r];

            double result;

            switch (sign) {
                case '+':
                    result = Double.parseDouble( new DecimalFormat("#.00").format(num_1 + num_2));
                    break;
                case '-':
                    result = Double.parseDouble( new DecimalFormat("#.00").format(num_1 - num_2));
                    break;
                case '*':
                    result = Double.parseDouble( new DecimalFormat("#.00").format(num_1 * num_2));
                    break;
                case '/':
                    result = Double.parseDouble( new DecimalFormat("#.00").format(num_1 / num_2));
                    break;
                default:
                    result = 0;
            }

            double user = boot_Method(num_1, num_2, sign);

            if (result == user) {
                System.out.println("正确，是否继续(Y/N)");
                String input = new Scanner(System.in).nextLine();

                if (input.toLowerCase(Locale.ROOT).equals("n")) {
                    break;
                } else {
                    while ((!input.toLowerCase(Locale.ROOT).equals("y") && !input.toLowerCase(Locale.ROOT).equals("n"))) {
                        System.out.println("输入错误");
                        input = new Scanner(System.in).nextLine();
                    }

                }

            } else {
                System.out.print("错误。");
                System.out.println(result);
            }
        }

        System.out.println("程序结束");
    }

    private double boot_Method(double input_1, double input_2, char sign) {
        double output;

        while (true) {
            System.out.printf("%s %s %s %s %s", "请计算", input_1, sign, input_2, "(小数部分保留两位小数): ");
            try {
                output = new Scanner(System.in).nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("错误，请重新输入。");
            }
        }

        return output;
    }
}
