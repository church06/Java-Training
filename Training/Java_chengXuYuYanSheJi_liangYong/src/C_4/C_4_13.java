package C_4;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class C_4_13 {

    public static void main(String[] args) {
        C_4_13 c413 = new C_4_13();
        c413.c413_method();
    }

    public void c413_method() {

        while (true) {
            System.out.println("输入字母判断元音辅音 (EXIT 退出)：");
            String input = new Scanner(System.in).nextLine().toUpperCase(Locale.ROOT);

            ArrayList<Object> list = new ArrayList<>();

            for (int i = 65; i < 91; i++) {
                list.add((char) i);
            }

            if (input.equals("EXIT")) {
                break;

            } else if (list.contains(input)) {
                switch (input) {
                    case "A":
                    case "E":
                    case "I":
                    case "O":
                    case "U":
                        System.out.println(input + " 是 元音");
                        break;
                    default:
                        System.out.println(input + " 是 辅音");
                }
            } else {
                System.out.println("错误。");
            }
        }

        System.out.println("程序结束");
    }
}
