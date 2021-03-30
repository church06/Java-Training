package C_4;

import java.util.Locale;
import java.util.Scanner;

public class C_4_12 {

    public static void main(String[] args) {
        C_4_12 c412 = new C_4_12();
        c412.c412_method();

    }

    public void c412_method() {

        System.out.println("请输入16进制数字：");

        while (true) {

            String input = detect();

            if (input.trim().toUpperCase(Locale.ROOT).equals("EXIT")) {
                System.out.println("结束运行");
                break;
            } else {
                System.out.println(Integer.toBinaryString(Integer.parseInt(input, 16)));
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
                    char[] list = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

                    boolean count = true;
                    int counter = 0;

                    for (int i = 0; i < input.length(); i++) {
                        for (char j : list) {
                            if (input.charAt(i) == j) {
                                counter++;
                                break;
                            }
                        }
                    }

                    if (counter != input.length()) {
                        count = false;
                    }

                    if (count) {
                        break;
                    } else {
                        System.out.println("???");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("???");
                }
            }
        }

        return input;
    }
}
