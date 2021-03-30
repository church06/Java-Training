package C_4;

import java.util.Locale;
import java.util.Scanner;

public class C_4_22 {

    public static void main(String[] args) {

        while (true) {
            System.out.print("字符串1: ");
            String input_1 = new Scanner(System.in).nextLine();
            System.out.print("字符串2: ");
            String input_2 = new Scanner(System.in).nextLine();

            if (input_1.toLowerCase(Locale.ROOT).equals("exit") || input_2.toLowerCase(Locale.ROOT).equals("exit")) {
                break;
            }

            if (input_1.contains(input_2)) {
                System.out.println(input_2 + " 是 " + input_1 + " 的子串");
            } else {
                System.out.println(input_2 + " 不是 " + input_1 + " 的子串");
            }
        }

        System.out.println("运行结束");
    }
}
