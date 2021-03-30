package C_5;

import java.util.Scanner;

public class C_5_14 {

    public static void main(String[] args) {
        System.out.print("输入正整数：");
        int[] list = new int[2];

        while (true) {
            String[] input = new Scanner(System.in).nextLine().split(" ");

            if (input.length != 2) {
                System.out.println("输入错误");
            } else {
                try {
                    int counter = 0;
                    for (String i : input) {
                        list[counter] = Integer.parseInt(i);
                        counter++;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("输入错误");
                }
            }
        }

        int num1 = list[0];
        int num2 = list[1];

        if (num1 > num2) {
            for (int i = num2; i > 0; i--) {
                if (num1 % i == 0 && num2 % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
        } else {
            for (int i = num1; i > 0; i--) {
                if (num1 % i == 0 && num2 % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}
