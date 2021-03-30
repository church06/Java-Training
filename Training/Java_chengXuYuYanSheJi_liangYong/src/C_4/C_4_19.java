package C_4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class C_4_19 {

    public static void main(String[] args) {

        C_4_19 c419 = new C_4_19();
        c419.c419_method();
    }

    public void c419_method() {

        while (true) {
            System.out.print("输入ISBN码进行查询 (exit - 退出)：");
            String input = new Scanner(System.in).nextLine();

            String[] code = input.split("");

            if (input.toUpperCase(Locale.ROOT).equals("EXIT")) {
                break;
            }

            int counter = 0;
            int bit = 0;
            for (String i : code) {
                try {
                    ++bit;
                    counter += Integer.parseInt(i) * bit;
                } catch (NumberFormatException e) {
                    System.out.println("输入错误");
                    break;
                }
            }

            if (bit == 9) {
                counter %= 11;

                if (counter == 10) {
                    code[code.length - 1] = "X";
                } else {
                    code[code.length - 1] = "1";
                }

                System.out.println(Arrays.toString(code).
                        replace("[", "").
                        replace("]", "").replace(", ", ""));
            }
        }

        System.out.println("程序结束");
    }
}
