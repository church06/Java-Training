package C_5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class C_5_39 {

    public static void main(String[] args) {

        System.out.println(Salary(5000));
        System.out.println(Salary(10000));
        System.out.println(Salary(25000));

    }

    public static BigDecimal Salary(double salary) {
        if (salary <= 5000) {
            BigDecimal interest_1 = new BigDecimal(salary * 0.08).setScale(2, RoundingMode.HALF_EVEN);
            System.out.print("初始工资: "+ salary + " 利润为: " + interest_1 + " 总工资为: ");
            return new BigDecimal(salary * 1.08).setScale(2, RoundingMode.HALF_EVEN);

        } else if (salary <= 10000) {
            BigDecimal interest_2 = BigDecimal.valueOf((salary - 5000) * 0.1 + 5000 * 0.08).
                    setScale(2, RoundingMode.HALF_EVEN);

            System.out.print("初始工资: "+ salary + " 利润为: " + interest_2 + " 总工资为: ");
            return BigDecimal.valueOf(5000 * 1.08 + (salary - 5000) * 1.1).setScale(2, RoundingMode.HALF_EVEN);

        } else {
            BigDecimal interest_3 = BigDecimal.valueOf((salary - 10000) * 0.12 + 5000 * 0.1 + 5000 * 0.08).
                    setScale(2, RoundingMode.HALF_EVEN);

            System.out.print("初始工资: "+ salary + " 利润为: " + interest_3 + " 总工资为: ");
            return BigDecimal.valueOf(5000 * 1.08 + 5000 * 1.1 + (salary - 10000) * 1.12).setScale(2, RoundingMode.HALF_EVEN);
        }
    }
}
