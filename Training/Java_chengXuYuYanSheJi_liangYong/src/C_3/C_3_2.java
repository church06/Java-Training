package C_3;

import java.util.Random;
import java.util.Scanner;

public class C_3_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C_3_2 c32 = new C_3_2();

        Random r = new Random();
        int a = r.nextInt(10);
        int b = r.nextInt(10);
        int c = r.nextInt(10);

        System.out.println("输入数字 - 随便输入即可开始游戏：");
        String wait = sc.next();
        System.out.println("当前拥有数字: " + a + ", " + b + ", " + c + "，请输入当前数字之和：");
        String input = sc.next();
        int in;

        while (true) {
            if (input.equals("M")) {
                System.out.println("Game Quit.");
                break;
            } else {
                if (c32.panDuan(input)) {
                    in = Integer.parseInt(input);

                    if (c32.shiFouXiangDeng(in, a, b, c)) {
                        System.out.println("结果正确。");

                        a = r.nextInt(10);
                        b = r.nextInt(10);
                        c = r.nextInt(10);

                        System.out.println("当前拥有数字: " + a + ", " + b + ", " + c + "，请输入当前数字之和：");

                        input = sc.next();
                    } else {

                        System.out.println("结果错误。");
                        System.out.println("当前拥有数字: " + a + ", " + b + ", " + c + "，请输入当前数字之和：");
                        input = sc.next();

                    }
                } else {

                    System.out.println("请输入正确数字!");
                    System.out.println("当前拥有数字: " + a + ", " + b + ", " + c + "，请输入当前数字之和：");
                    input = sc.next();

                }
            }
        }

    }

    public boolean panDuan(String input) {
        boolean decide = true;
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            decide = false;
        }

        return decide;
    }

    public boolean shiFouXiangDeng(int input, int a, int b, int c) {
        int sum = a + b + c;

        return input == sum;
    }
}
