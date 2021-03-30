package C_2;

import java.util.Scanner;

public class C_2_21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入总投资额：");
        double total = sc.nextDouble();
        System.out.println("输入年利率：");
        double rate = sc.nextDouble();
        System.out.println("输入年数：");
        int year = sc.nextInt();

        double future = total * Math.pow(1 + rate / 12 * 0.01, year * 12);
        System.out.println(future);
    }
}
