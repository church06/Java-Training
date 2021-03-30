package C_4;

import java.util.Locale;
import java.util.Scanner;

public class C_4_11 {
    public static void main(String[] args) {
        C_4_11 c411 = new C_4_11();
        c411.c411_method();

    }

    public void c411_method() {

        System.out.println("请输入10进制数字：");

        while (true) {

            String input = detect();

            if (input.trim().toUpperCase(Locale.ROOT).equals("EXIT")) {
                System.out.println("结束运行");
                break;
            } else {
                System.out.println(Integer.toHexString(Integer.parseInt(input)));
                System.out.println("是否继续？ - 输入EXIT退出.");
            }
        }
    }

    public String detect() {
        String input;

        while (true) {
            input = new Scanner(System.in).nextLine();

            if (input.trim().toUpperCase(Locale.ROOT).equals("EXIT")) {
                break;
            } else {
                try {
                    int num = Integer.parseInt(input);
                    if (num > 15) {
                        System.out.println("???");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("???");
                }
            }
        }

        return input;
    }

}
