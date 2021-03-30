package C_4;

import java.util.Locale;
import java.util.Scanner;

public class C_4_21 {

    public static void main(String[] args) {
        C_4_21 c421 = new C_4_21();
        c421.c421_method();
    }

    public void c421_method () {
        while (true) {

            System.out.println("请输入社保号\n(格式: DDD-DD-DDDD)\n(exit - 退出)");
            String input = new Scanner(System.in).nextLine();

            if (input.toLowerCase(Locale.ROOT).equals("exit")) {
                break;
            } else {
                if (input.length() != 11) {
                    System.out.println("输入错误 长度错误");
                } else {
                    if (input.charAt(3) != '-' && input.charAt(6) != '-') {
                        System.out.println("不合法社保号 格式错误");
                    } else {
                        System.out.println("合法社保号 " + input);
                    }
                }
            }
        }

        System.out.println("程序结束");
    }
}
