package C_4;

import java.util.Locale;
import java.util.Scanner;

public class C_4_14 {

    public static void main(String[] args) {

        while (true) {
            System.out.println("输入等级：");
            String input = new Scanner(System.in).nextLine().toLowerCase(Locale.ROOT);

            if (input.equals("exit")) {
                break;
            }

            switch (input) {
                case "a":
                    System.out.println("等级为 4");
                    break;
                case "b":
                    System.out.println("等级为 3");
                    break;
                case "c":
                    System.out.println("等级为 2");
                    break;
                case "d":
                    System.out.println("等级为 1");
                    break;
                case "f":
                    System.out.println("等级为 0");
                    break;
                default:
                    System.out.println("输入错误");
            }
        }
    }
}
