package C_4;

import java.util.Locale;
import java.util.Scanner;

public class C_4_15 {

    public static void main(String[] args) {
        C_4_15 c414 = new C_4_15();
        c414.c414_method();

    }

    public void c414_method () {

        while (true) {
            System.out.println("输入字母进行电话键对应 - EXIT 退出：");
            String input = new Scanner(System.in).nextLine().toLowerCase(Locale.ROOT);

            if (input.equals("exit")) {
                break;
            }

            switch (input) {
                case "abc":
                case "a":
                case "b":
                case "c":
                    System.out.println("对应电话键：2");
                    break;
                case "def":
                case "d":
                case "e":
                case "f":
                    System.out.println("对应电话键：3");
                    break;
                case "ghi":
                case "g":
                case "h":
                case "i":
                    System.out.println("对应电话键：4");
                    break;
                case "jkl":
                case "j":
                case "k":
                case "l":
                    System.out.println("对应电话键：5");
                    break;
                case "mno":
                case "m":
                case "n":
                case "o":
                    System.out.println("对应电话键：6");
                    break;
                case "pqrs":
                case "p":
                case "q":
                case "r":
                case "s":
                    System.out.println("对应电话键：7");
                    break;
                case "tuv":
                case "t":
                case "u":
                case "v":
                    System.out.println("对应电话键：8");
                    break;
                case "wxyz":
                case "w":
                case "x":
                case "y":
                case "z":
                    System.out.println("对应电话键：9");
                    break;
                default:
                    System.out.println("输入错误");

            }
        }

        System.out.println("结束运行");
    }
}
