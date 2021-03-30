package C_3;

import java.util.Scanner;

public class C_3_26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入一个数字：");
        double input = sc.nextDouble();

        if (input % 5 != 0 && input % 6 != 0) {
            System.out.println("不能被5和6整除。");
        } else if (input % 5 == 0 || input % 6 ==0) {
            System.out.println("能被5或6其中一个整除。");
        } else if (input % 5 == 0 && input % 6 ==0) {
            System.out.println("能够被5和6整除。");
        } else {
            System.out.println("???");
        }
    }
}
