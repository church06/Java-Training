package C_2;

import java.util.Scanner;

public class C_2_5 {

    public static void main(String[] args) {
        System.out.println("输入费用：");
        Scanner sc = new Scanner(System.in);
        double found = sc.nextDouble();
        System.out.println("输入酬金率：");
        double rate = sc.nextDouble();
        System.out.println("费用：" + found + "\n酬金率：" + rate + "%\n酬金：" + found * (rate * 0.01) + "\n总金额：" +
                (found + found * (rate * 0.01)));
    }
}
