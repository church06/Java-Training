package C_4;

import java.util.Locale;
import java.util.Scanner;

public class C_4_17 {

    public static void main(String[] args) {
        String[] days_31 = {"jan", "mar", "may", "jul", "aug", "oct", "dec"};
        String[] days_30 = {"apr", "jun", "sep", " nov"};

        while (true) {

            System.out.println("输入年份和月份来确定天数 (任意为exit即可退出)：");


            Object year = new C_4_17().detect();

            System.out.print("月份：");
            String month = new Scanner(System.in).nextLine().toLowerCase(Locale.ROOT);



            if (year.equals("exit") || month.equals("exit")) {
                break;
            }

            int counter  = 0;

            for (String i : days_30) {
                if (month.contains(i)) {
                    counter = 2;
                    break;
                }
            }

            for (String i : days_31) {
                if (month.contains(i)) {
                    counter = 1;
                    break;
                } else {
                    counter = 4;
                }
            }

            if ((Integer) year % 4 == 0) {
                counter = 3;
            }

            switch (counter) {
                case 0:
                    System.out.println("本月有 28 天");
                    break;
                case 1:
                    System.out.println("本月有 31 天");
                    break;
                case 2:
                    System.out.println("本月有 30 天");
                    break;
                case 3:
                    System.out.println("本月有 29 天");
                    break;
                default:
                    System.out.println("输入错误");
            }

        }
        System.out.println("程序结束");
    }

    private Object detect () {
        System.out.print("年份：");

        while (true) {
            String year = new Scanner(System.in).nextLine().toLowerCase(Locale.ROOT);

            try {
                if (year.equals("exit")) {
                    return year;
                } else {
                    return Integer.parseInt(year, 10);
                }
            } catch (NumberFormatException e) {
                System.out.println("输入错误");
                System.out.print("年份：");
            }
        }
    }
}
