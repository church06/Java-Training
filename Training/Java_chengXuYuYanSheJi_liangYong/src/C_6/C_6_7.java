package C_6;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class C_6_7 {

    public static void main(String[] args) {
        C67_method();
    }

    public static void C67_method() {
        System.out.println("Total: " + BigDecimal.
                valueOf(futureInvestmentValue(1000, 9, 30)).
                setScale(2, RoundingMode.HALF_EVEN));
    }

    public static double futureInvestmentValue(double investmentAmount, double AnnualRate, int years) {
        double output = investmentAmount;
        double interest = 0;
        double rate = (AnnualRate / 12) * 0.01;

        for (int i = 1; i <= years; i++) {

            for (int j = 0; j < 12; j++) {
                interest = output * rate;
                output += interest;
            }

            System.out.println("Year: " + i +
                    " Interest: " + new BigDecimal(interest).setScale(2, RoundingMode.HALF_EVEN) +
                    " return: " + new BigDecimal(output).setScale(2, RoundingMode.HALF_EVEN));
        }

        return output;
    }
}
