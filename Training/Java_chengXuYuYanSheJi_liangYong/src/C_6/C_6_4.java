package C_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C_6_4 {

    public static void main(String[] args) {
        C64_method();
    }

    public static void C64_method() {

        while (true) {
            System.out.println("输入数字将显示其反转: ");

            try {
                int input = new Scanner(System.in).nextInt();
                reverse(input);

            } catch (InputMismatchException e) {
                System.out.println("输入错误, 是否退出? [Y / N]");
                String exit = new Scanner(System.in).nextLine();

                if (exit.equalsIgnoreCase("y")) {
                    break;
                }
            }
        }
        System.out.println("程序结束");
    }

    public static void reverse(int num) {

        String input = Integer.toString(num);

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }

        System.out.println();
    }

}
