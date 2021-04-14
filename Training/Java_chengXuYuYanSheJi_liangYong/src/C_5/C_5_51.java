package C_5;

import java.util.Scanner;

public class C_5_51 {

    public static void main(String[] args) {
        C551_method();
    }

    public static void C551_method() {

        while (true) {

            System.out.println("输入第一个字符串: ");
            String input_1 = new Scanner(System.in).nextLine();

            if (input_1.equalsIgnoreCase("n")) {break;}

            System.out.println("输入第二个字符串: ");
            String input_2 = new Scanner(System.in).nextLine();

            if (input_2.equalsIgnoreCase("n")) {break;}

            int index = Math.min(input_1.length(), input_2.length());
            int pre_index = 0;

            for (int i = 0; i < index; i++) {

                if (input_1.charAt(i) == input_2.charAt(i) && (pre_index == i || pre_index == i -1)) {
                    pre_index = i;
                    System.out.print(input_1.charAt(i));
                }


            }

            System.out.println();
        }
        System.out.println("程序结束");
    }
}
