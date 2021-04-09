package C_5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class C_5_31 {

    public static void main(String[] args) {

        while (true) {
            try {

                System.out.print("输入[CD价值, 年利率, 月数]：");
                String user_input = new Scanner(System.in).nextLine();

                if (user_input.equalsIgnoreCase("n")) {
                    break;
                }

                System.out.println(user_input);

                String[] data = user_input.split(",");

                BigDecimal value = BigDecimal.valueOf(Double.parseDouble(data[0].trim())).
                        setScale(2, RoundingMode.HALF_EVEN);
                BigDecimal interest = BigDecimal.valueOf(Double.parseDouble(data[1].trim())).
                        setScale(2, RoundingMode.HALF_EVEN);
                int months = Integer.parseInt(data[2].trim());

                System.out.printf("%s%"+Integer.toString(months).length() + "s  %s%n","Month", " ", "Value" );

                for (int i = 0; i < months; i++) {

                    BigDecimal extra = value.multiply(interest.multiply(BigDecimal.valueOf(0.01 / 12))).
                            setScale(2, RoundingMode.HALF_EVEN);

                    value = value.add(extra).setScale(2, RoundingMode.HALF_EVEN);

                    System.out.printf("  %s%" + Integer.toString(months).length() + "s    %s%n", i + 1, " ", value);

                }

            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("输入错误");
            }

        }

        System.out.println("程序结束");
    }
}
