package C_5;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class C_5_21 {

    public static void main(String[] args) {

        C_5_21.c521Method();

    }

    private static void c521Method() {

        while (true) {
            double loan = C_5_21.amountInput();
            double time = C_5_21.timeInput();
            System.out.printf("%s    %s    %s%n", "Interest Rate", "Monthly Payment", "Total Payment");

            double rate = 0.05;

            for (int i = 0; i < time; i++) {
                String ratio = new DecimalFormat("#.000%").format(rate);
                String result = new DecimalFormat(".00").format(loan * (rate + 1));
                String monthly = new DecimalFormat(".00").format(loan * (rate + 1) / 12);
                rate += rate * (1.0 / 8);
                System.out.printf("%s%11s%s%13s%s%n", ratio," ", monthly," ", result);
            }
            System.out.print("任意键继续，n - 退出：");
            String input = new Scanner(System.in).nextLine();
            if (input.toLowerCase(Locale.ROOT).equals("n")) {
                break;
            }
        }

        System.out.println("程序结束");
    }

    static double amountInput() {
        System.out.print("输入贷款数量：");
        return inputMethod();
    }

    static double timeInput() {
        System.out.print("年数：");
        return inputMethod();
    }

    private static double inputMethod() {
        while (true) {
            String amount = new Scanner(System.in).nextLine();

            if (amount.toLowerCase(Locale.ROOT).equals("n")) {
                return -1;
            }

            try {
                return Double.parseDouble(amount);
            } catch (NumberFormatException e) {
                System.out.println("输入错误");
            }
        }
    }
}
