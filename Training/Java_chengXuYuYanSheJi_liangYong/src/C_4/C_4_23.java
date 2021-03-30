package C_4;

import java.util.Locale;
import java.util.Scanner;

public class C_4_23 {

    public static void main(String[] args) {

        C_4_23 c423 = new C_4_23();
        c423.c423_method();
    }

    public void c423_method() {

        while (true) {
            System.out.println("税后工资计算程序 ver1.0\nexit：退出 reload：重载\n");
            System.out.print("姓名：");
            String name = new Scanner(System.in).nextLine();

            if (name.toLowerCase(Locale.ROOT).equals("exit")) {
                break;
            }

            String[] titles = {"时长：", "时薪：", "联邦税率：", "州税率："};

            double hour = Detect(titles[0]);
            if (hour == -1) {
                break;
            } else if (hour == -2) {
                continue;
            }

            double hour_rate = Detect(titles[1]);
            if (hour_rate == -1) {
                break;
            } else if (hour_rate == -2) {
                continue;
            }

            double country_rate = Detect(titles[2]);
            if (country_rate == -1) {
                break;
            } else if (country_rate == -2) {
                continue;
            }

            double city_rate = Detect(titles[3]);
            if (city_rate == -1) {
                break;
            } else if (city_rate == -2) {
                continue;
            }

            function(name, hour, hour_rate, country_rate, city_rate);

            if (continueFunction()) {
                break;
            }

        }

        System.out.println("程序结束");

    }

    private double Detect(String title) {

        while (true) {
            System.out.print(title);
            String output = new Scanner(System.in).nextLine();

            try {
                if (output.toLowerCase(Locale.ROOT).equals("exit")) {
                    return -1;
                } else if (output.toLowerCase(Locale.ROOT).equals("reload")) {
                    return -2;
                } else {
                    return Double.parseDouble(output);
                }
            } catch (NumberFormatException e) {
                System.out.println("输入错误");
            }
        }
    }

    private void function(String name, double hour, double hour_rate, double country_rate, double city_rate) {

        double salary = hour * hour_rate;
        double tax = salary * (country_rate + city_rate);
        double salary_afterTax = salary - tax;

        System.out.printf("姓名：%s    工作时长：%.2f%n" +
                "时薪：%.3f    税前工资：%.3f%n" +
                "扣除额：%n" +
                "   联邦所得税：%.3f  周所得税：%.3f%n" +
                "   总税收：%.3f%n" +
                "税后工资：%.3f%n", name, hour, hour_rate, salary, country_rate, city_rate, tax, salary_afterTax);
    }

    private boolean continueFunction() {

        System.out.println("是否继续？ (y / n)：");
        String detect = new Scanner(System.in).nextLine();

        if (detect.toLowerCase(Locale.ROOT).equals("n")) {
            return true;
        } else {
            while (true) {
                if (detect.toLowerCase(Locale.ROOT).equals("y")) {
                    return false;
                } else {
                    System.out.println("输入错误");
                }
            }
        }
    }

}
