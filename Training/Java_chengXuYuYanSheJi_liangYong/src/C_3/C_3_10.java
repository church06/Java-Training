package C_3;

import java.util.Random;
import java.util.Scanner;

public class C_3_10 {

    int num1;
    int num2;

    int num;

    public static void main(String[] args) {
        Random r = new Random();
        C_3_10 c310 = new C_3_10();

        c310.num1 = r.nextInt(10);
        c310.num2 = r.nextInt(10);

        c310.numDetect();
// ===========================================================================================
        Scanner sc = new Scanner(System.in);
        System.out.println("计算：" + c310.num1 + " - " + c310.num2 + ", M 退出。");
        String input = sc.nextLine();

        do {
            boolean detect = false;

            // 判断是否退出
            if (input.equals("M")) {
                System.out.println("程序结束");
                break;
            } else {
                detect = c310.errorDetect(input);
            }

            // 判断格式和结果
            if (detect) {
                if (c310.resultDetect()) {
                    System.out.println("结果正确。");

                    c310.num1 = r.nextInt(10);
                    c310.num2 = r.nextInt(10);

                    c310.numDetect();

                } else {
                    System.out.println("结果错误。");
                }
            } else {
                System.out.println("输入错误。");
            }

            System.out.println("计算：" + c310.num1 + " - " + c310.num2 + ", M 退出。");
            // 新的输入
            input = sc.nextLine();
        }while (true);

    }

    private boolean errorDetect(String input) {
        boolean output = true;
        try {
            num = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            output = false;
        }
        return output;
    }

    private boolean resultDetect () {
        boolean output = true;

        if (num != num1 - num2) {
            output = false;
        }

        return output;
    }

    private void numDetect () {
        if (num1 < num2) {
            int cur = num1;
            num1 = num2;
            num2 = cur;
        }
    }
}
