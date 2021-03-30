package C_2;

import java.util.Scanner;

public class C_2_4 {

    public static void main(String[] args) {
        System.out.println("输入磅：");
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        System.out.println("等于：" + input * 0.454 + " 千克。");
    }
}
