package C_6;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class C_6_9 {

    public static void main(String[] args) {
        C69_method();
    }

    public static void C69_method() {
        int i = 20;

        System.out.println("摄氏度    华氏度      华氏度    摄氏度");

        for (int j = 1; j <= 10; j++) {
            BigDecimal c = BigDecimal.valueOf(footToMeter(j)).setScale(2, RoundingMode.HALF_EVEN);
            BigDecimal f = BigDecimal.valueOf(meterToFoot(i)).setScale(2, RoundingMode.HALF_EVEN);

            System.out.printf("  %-4s   %-6s       %-4s   %s%n", j, c, i, f);

            i -= 5;
        }
    }

    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}
