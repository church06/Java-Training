package C_3;

import java.util.Scanner;

public class C_3_31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();

        if (input == 0) {

            System.out.println("输入美元：");
            input = sc.nextDouble();

            System.out.println("输入汇率：");
            double rate = sc.nextDouble();

            System.out.println("美元兑人民币：" + rate * input);
        } else if (input == 1) {

            System.out.println("输入人民币：");
            input = sc.nextDouble();

            System.out.println("输入汇率：");
            double rate = sc.nextDouble();

            System.out.println("人民币兑美元：" + rate * input);
        }
    }
}
