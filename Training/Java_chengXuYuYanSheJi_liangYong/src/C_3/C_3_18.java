package C_3;

import java.util.Scanner;

public class C_3_18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C_3_18 c318 = new C_3_18();
        System.out.println("请输入物品重量(磅) - 输入exit退出：");

        String input = sc.next();

        while (!input.equals("exit")) {
            try {
                double weight = Double.parseDouble(input);
                if (c318.WeightDetect(weight) == -1) {
                    System.out.println("该物品无法寄送。");
                    input = sc.next();

                } else {
                    System.out.println("邮寄运费为：" + c318.WeightDetect(weight));
                    input = sc.next();
                }
            } catch (NumberFormatException e) {
                System.out.println("请输入正确数字。");
                input = sc.next();
            }
        }

        System.out.println("已退出。");
    }

    private double WeightDetect (double input) {
        double price;
        if (input > 0 && input <= 1) {
            price = 3.5;
        } else if (input > 1 && input <= 3) {
            price = 5.5;
        } else if (input > 3 && input <= 10) {
            price = 8.5;
        } else if (input > 10 && input <= 20) {
            price = 10.5;
        } else {
            price = -1;
        }

        return price;
    }
}
