package C_2;

import java.util.Scanner;

public class C_2_20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("输入收支余额：");
        double balance = sc.nextDouble();
        System.out.println("输入年利率：");
        double rate = sc.nextDouble();

        double interests = balance * (rate / 1200);
        System.out.println(interests);

    }
}
