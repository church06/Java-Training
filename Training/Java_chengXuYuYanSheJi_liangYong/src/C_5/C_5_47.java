package C_5;

import java.util.Scanner;

public class C_5_47 {

    public static void main(String[] args) {
        C547_method();
    }

    public static void C547_method() {

        while (true) {
            System.out.println("输入ISBN-13码: ");
            String input = new Scanner(System.in).nextLine();

            if (input.equalsIgnoreCase("n")) {
                break;
            } else if (input.length() != 12) {
                System.out.println(input + " 存在错误: 长度错误");
                continue;
            }

            int sum = 0;
            int remain = 0;

            for (int i = 0; i < input.length(); i++) {
                int num = Integer.parseInt(input.charAt(i) + "");

                if (i % 2 != 0) {
                    sum += 3 * num;
                } else {
                    sum += num;
                }

                remain = 10 - sum % 10;

                if (remain == 10) {
                    remain = 0;
                }
            }
            System.out.println("输出为: " + input + remain);
        }
        System.out.println("程序结束");
    }
}
