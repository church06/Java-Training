package C_5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class C_5_42 {

    public static void main(String[] args) {
        C542_method();
    }

    public static void C542_method() {

        while (true) {

            System.out.print("输入 [工资, 提成范围, 提成, ..., 无上限提成]\n[n - 退出]: ");
            String input = new Scanner(System.in).nextLine().replaceAll(" ", "");

            if (input.equalsIgnoreCase("n")) {
                break;
            }

            try {
                String[] data_s = input.split(",");

                if ((data_s.length - 1) % 2 != 1 || data_s.length == 2) {
                    System.out.println("缺少条件");
                    continue;
                } else if (data_s.length == 1) {
                    System.out.println("工资为: " + data_s[0]);
                    continue;
                }

                LinkedList<Double> data = new LinkedList<>();

                double salary = 0;

                for (int i = 0; i < data_s.length; i++) {
                    if (i == 0) {
                        salary = Double.parseDouble(data_s[i]);

                    } else {
                        if (Double.parseDouble(data_s[i]) < 0) {
                            System.out.println("提成和范围不能为负数");
                            break;
                        }
                        data.add(Double.parseDouble(data_s[i]));
                    }
                }

                if (data.size() + 1 != data_s.length) {
                    System.out.println("格式错误， 提成与范围: " + data.size() + " 输入内容: " + data_s.length + "\n" +
                            "两者相差应为1， 第一个数值为工资，抛去后长度-1。");
                    break;

                } else {
                    System.out.print("总工资为: " + Salary_do_while(salary, data, true) + "\n\n");
                }

            } catch (NumberFormatException e) {
                System.out.println("输入错误");
            }
        }
        System.out.println("程序结束");
    }

// =============================================================================================

    public static BigDecimal Salary_do_while(double salary, LinkedList<Double> statement, boolean printResult) {

        ArrayList<Double> interest = new ArrayList<>();
        ArrayList<Double> levels = new ArrayList<>();

        double infinity_interest = statement.get(statement.size() - 1) * 0.01;

        for (int i = 0; i < statement.size() - 1; i++) {

            if (i % 2 == 0) {
                levels.add(statement.get(i));

            } else {
                interest.add(statement.get(i) * 0.01);
            }
        }

        double total = salary;
        int index = levels.size() - 1;

        for (double i : levels) {

            if (i > salary && levels.size() >= 2) {
                index = levels.indexOf(i) - 1;
            }
        }

        for (int j = 0; j <= index; j++) {

            if (interest.size() != 0) {
                if (j != 0) {
                    total += (levels.get(j) - levels.get(j - 1)) * interest.get(j);

                } else {
                    total += levels.get(j) * interest.get(j);
                }

                if (printResult) {
                    System.out.println("区间: " + levels.get(j) + " 提成: " + interest.get(j) + " 结算: " + total);
                }
            }
        }

        if (salary > levels.get(levels.size() - 1)) {
            total += (salary - levels.get(index)) * infinity_interest;

            if (printResult) {
                System.out.print("剩余: " + (salary - levels.get(index)) + " 提成: " + infinity_interest + " ");
            }

        } else if (interest.size() == 1) {
            total += (salary - levels.get(index)) * interest.get(index);

            if (printResult) {
                System.out.print("剩余: " + (salary - levels.get(index)) + " 提成: " + interest.get(index) + " ");
            }

        } else {
            total += (salary - levels.get(index)) * interest.get(index + 1);

            if (printResult) {
                System.out.print("剩余: " + (salary - levels.get(index)) + " 提成: " + interest.get(index + 1) + " ");
            }
        }


        return new BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN);
    }
}
