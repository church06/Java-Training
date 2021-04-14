package C_5;

import java.util.Scanner;

public class C_5_48 {

    public static void main(String[] args) {
        C548_method();
    }

    public static void C548_method() {

        while (true) {
            System.out.println("获取奇数字符位置: ");
            String input = new Scanner(System.in).nextLine();

            if (input.equalsIgnoreCase("n")) {
                break;
            }

            for (int i = 0; i < input.length(); i++) {
                if (i % 2 == 0) {
                    System.out.print(input.charAt(i));
                }
            }

            System.out.println();
        }
        System.out.println("程序结束");
    }
}
