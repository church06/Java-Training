package C_6;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class C_6_15 {

    public static void main(String[] args) {
        C615_method();
    }

    public static void C615_method() {

        System.out.printf("%-8s %-10s %-14s %-17s %-8s%n", "Income", "Single", "Married Joint", "Married Separate", " Head of House");

        for (int i = 50000; i <= 60000; i += 50) {

            double[] list = new double[4];

            for (int j = 0; j < 4; j++) {
                list[j] = computeTax(j, i);
            }

            System.out.printf("%-8s %-10s %-14s %-18s %-8s%n", i, list[0], list[1], list[2], list[3]);

        }
    }

    public static double computeTax(int status, double taxableIncome) {
        switch (status) {
            default:
                int[] level = {8350, 33950, 52250, 171550, 372950};

                return Double.parseDouble(
                        BigDecimal.valueOf(taxRate(level, taxableIncome)).
                                setScale(2, RoundingMode.HALF_EVEN).
                                toString());

            case 1:
                level = new int[]{16700, 67900, 137050, 208050, 372950};

                return Double.parseDouble(
                        BigDecimal.valueOf(taxRate(level, taxableIncome)).
                                setScale(2, RoundingMode.HALF_EVEN).
                                toString());

            case 2:
                level = new int[]{8350, 33950, 68525, 104425, 186475};

                return Double.parseDouble(
                        BigDecimal.valueOf(taxRate(level, taxableIncome)).
                                setScale(2, RoundingMode.HALF_EVEN).
                                toString());

            case 3:
                level = new int[]{11950, 45500, 117450, 190200, 372950};

                return Double.parseDouble(
                        BigDecimal.valueOf(taxRate(level, taxableIncome)).
                                setScale(2, RoundingMode.HALF_EVEN).
                                toString());
        }
    }

    public static double taxRate(int[] level, double income) {

        int counter = 0;

        for (int i = 0; i < level.length; i++) {

            if (income < level[i]) {
                counter = i;
                break;

            } else {
                counter = level.length - 1;
            }
        }

        return tax_sum(counter, level, income);
    }

    public static double tax_sum(int counter, int[] level, double income) {

        double[] rate = {0.1, 0.15, 0.25, 0.28, 0.33, 0.35};

        if (counter == 0) {
            return income * rate[0];

        } else {
            double taxPart =  income - level[counter - 1];
            double remain = income - taxPart;
            return taxPart * rate[counter] + tax_sum(counter - 1, level, remain);
        }
    }
}
