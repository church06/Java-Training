package C_5;

import java.math.BigDecimal;
import java.util.*;

public class C_5_42 {

    public static void main(String[] args) {
        C542_method();
    }

    public static void C542_method() {
        while (true) {

            String input = new Scanner(System.in).nextLine().replaceAll(" ", "");

            try {
                String[] data_s = input.split(",");

                if (data_s.length % 2 != 1) {
                    System.out.println("缺少条件");
                    continue;
                }

                LinkedList<Double> data = new LinkedList<>();
                double salary = 0;
                for (int i = 0; i < data_s.length; i++) {
                    if (i == 0) {
                        salary = Double.parseDouble(data_s[i]);
                    } else {
                        data.add(Double.parseDouble(data_s[i]));
                    }
                }

                System.out.println(Salary_do_while(salary, data));

            } catch (NumberFormatException e) {
                System.out.println("输入错误");
            }
        }
    }

    public static BigDecimal Salary_do_while(double salary, LinkedList<Double> statement) {

        for (int i = 0; i < statement.size(); i += 2) {

        }

        return new BigDecimal(0);
    }
}
