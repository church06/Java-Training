package C_5;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class C_5_22 {

    public static void main(String[] args) {
        C_5_22.c522Method();

    }

    public static void c522Method() {

        while (true) {
            double loan = C_5_22.amountInput();
            double time = C_5_22.timeInput();
            double rate = rateInput()/12 * 0.01;

            double result = loan;
            double loan_perMonth = (loan * (1 + rate)) / 12;

            double total = totalCompute(loan, rate, loan_perMonth) + loan_perMonth;

            System.out.printf("%s%s%n%s%s%n%n", "Monthly Payment: ", loan_perMonth, "Total Payment: ", total);

            System.out.printf("%s    %s    %s    %s%n", "Payment#", "Interest", "Monthly Payment", "Balance");

            for (int i = 0; i < time; i++) {
                for (int j = 1; j < time * 13; j++) {

                    double interest = result * rate;
                    String interest_str = new DecimalFormat(".00").format(interest);

                    double monthly = loan_perMonth - interest;
                    String monthly_str = new DecimalFormat(".00").format(monthly);

                    result -= monthly;
                    String result_str = new DecimalFormat(".00").format(result);

                    System.out.printf("%-12s%-12s%-19s%-13s%n", j, interest_str, monthly_str, result_str);
                }

            }
            System.out.print("任意键继续，n - 退出：");
            String input = new Scanner(System.in).nextLine();
            if (input.toLowerCase(Locale.ROOT).equals("n")) {
                break;
            }
        }

        System.out.println("程序结束");
    }

    private static double amountInput() {
        System.out.print("输入贷款数量：");
        return inputMethod();
    }

    private static double timeInput() {
        System.out.print("年数：");
        return inputMethod();
    }

    private static double rateInput() {
        System.out.print("年利率：");
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
    private static double totalCompute (double loan, double rate, double perMonth) {
        double remain = loan;
        double interest = 0;

        for (int i = 0; i < 12; i++) {
            interest += remain * rate;
            double monthly = perMonth - interest;
            remain -= monthly;
        }

        return interest;
    }
}
