package C_5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class C_5_35 {

    public static void main(String[] args) {
        System.out.println(calculator());
    }

    private static BigDecimal calculator() {

        double result = 0;
        for (int i = 1; i < 625; i++) {
            double first = Math.pow(i, 0.5);
            double second = Math.pow(i + 1, 0.5);
            result += 1 / (first + second);
        }

        return new BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN);
    }
}
