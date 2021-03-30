package C_3;

import java.util.Scanner;

public class C_3_21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C_3_21 c321 = new C_3_21();

        System.out.println("输入年份：");
        int year = sc.nextInt();
        System.out.println("输入月份：");
        int m = sc.nextInt();
        System.out.println("输入日期：");
        int q = sc.nextInt();

        if (m == 1) {
            m = 13;
            year -= 1;
        } else if (m == 2) {
            m = 14;
            year -= 1;
        }

        int j = year / 100;
        int k = year % 100;

        int h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

        System.out.println(c321.dateToDay(h));

    }

    enum Months {
        Sat, Sun, Mon, Tue, Wed, Thu, Fri
    }

    private Months dateToDay(int input) {
        switch (input) {
            case 0:
                return Months.Sat;
            case 1:
                return Months.Sun;
            case 2:
                return Months.Mon;
            case 3:
                return Months.Tue;
            case 4:
                return Months.Wed;
            case 5:
                return Months.Thu;
            case 6:
                return Months.Fri;
            default:
                return null;
        }
    }
}
