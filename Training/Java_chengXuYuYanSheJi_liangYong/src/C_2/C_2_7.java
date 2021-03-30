package C_2;

import java.util.Scanner;

public class C_2_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分钟：");
        int input = sc.nextInt();

        double day = input / 60.0 /24.0;
        int year = (int)day / 365;
        double remain = day % 365;

        System.out.println("输入的时间为：" + year + " 年 " + remain + " 天。");
    }
}
