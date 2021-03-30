package C_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C_2_22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入钱数 (整数)：");
        int input = 0;
        try {
            input = sc.nextInt();
            int pennies = input % 100;
            int dollars = (input - pennies) / 100;
            System.out.println(dollars + " 美元 " + pennies + " 美分。");
        } catch (InputMismatchException e) {
            System.out.println("?????????\n请输入人整数！！！！！");
        }
    }
}
