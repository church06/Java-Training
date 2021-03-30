package C_4;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class C_4_10 {

    public static void main(String[] args) {
        C_4_10 c410 = new C_4_10();
        c410.c410_method();

    }

    public void c410_method() {
        String input;
        Random r = new Random();
        int year = r.nextInt(2021) + 1;
        int month = r.nextInt(12) + 1;
        int day = day_builder(month);

        while (true) {
            System.out.println("您的生日为:" + year + "年" + month + "月" + day + "日。");
            input = detect();
            switch (input) {

                case "Y":
                    System.out.println("猜对了");
                    System.out.println("是否退出？(输入exit)");
                    break;
                case "N":
                    System.out.println("猜错了,输入任意键继续");
                    year = r.nextInt(2021) + 1;
                    month = r.nextInt(12) + 1;
                    day = day_builder(month);
                    break;
                default:
                    break;
            }
            input=detect();
            if (input.equals("EXIT")) {
                break;
            }
        }
        System.out.println("程序退出");
    }

    public int day_builder(int month) {
        Random r = new Random();
        int day;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = r.nextInt(31) + 1;
                break;
            case 2:
                day = r.nextInt(28) + 1;
                break;
            default:
                day = r.nextInt(30) + 1;
        }

        return day;
    }

    public String detect () {
        String input;
        do {
            try {

                Scanner sc = new Scanner(System.in);
                input = sc.nextLine().toUpperCase(Locale.ROOT);

            } catch (InputMismatchException e) {
                System.out.println("???");

                Scanner sc = new Scanner(System.in);
                input = sc.nextLine().toUpperCase(Locale.ROOT);
            }
        } while (!(input.equals("Y") || input.equals("N") || input.equals("EXIT")));
        return input;
    }
}
