package C_2;

import java.util.Scanner;

public class C_2_3 {

    public static void main(String[] args) {
        System.out.println("输入英尺：");
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();

        double meter = input * 0.305;
        System.out.println("等于：" + meter + " 米。");
    }
}
