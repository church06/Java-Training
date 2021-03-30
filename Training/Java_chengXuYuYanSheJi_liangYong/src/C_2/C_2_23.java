package C_2;

import java.util.Scanner;

public class C_2_23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("输入驾驶距离：");
        double distance = sc.nextDouble();

        System.out.println("输入燃油性能 (加仑/英里)：");
        double power = sc.nextDouble();

        System.out.println("每加仑价格：");
        double price = sc.nextDouble();



        double total = (distance / power) * price;

        System.out.println(total);
    }
}
