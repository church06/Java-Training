package C_5;

import java.util.Scanner;

public class C_5_46 {

    public static void main(String[] args) {
        C546_method();

    }

    public static void C546_method() {
        while (true) {
            System.out.println("字符反向输出 [n - 退出]: ");
            String input = new Scanner(System.in).nextLine();

            if (input.equalsIgnoreCase("n")) {
                break;
            }

            for (int i = input.length() - 1; i >= 0; i--) {
                System.out.print(input.charAt(i));
            }
            System.out.println();
        }
    }
}
