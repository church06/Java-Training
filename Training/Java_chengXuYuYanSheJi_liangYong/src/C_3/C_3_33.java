package C_3;

import java.util.Scanner;

public class C_3_33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入重量：");
        double input1 = sc.nextDouble();
        System.out.println("输入价格：");
        double input2 = sc.nextDouble();

        double result1 = input1 * input2;

        System.out.println("输入重量：");
        input1 = sc.nextDouble();
        System.out.println("输入价格：");
        input2 = sc.nextDouble();

        double result2 = input2 * input1;

        if (result1 > result2) {
            System.out.println("第二个划算");
        } else if (result1 == result2) {
            System.out.println("二者相同");
        } else {
            System.out.println("第一个划算");
        }
    }
}
